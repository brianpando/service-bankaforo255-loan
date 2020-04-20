package com.app.aforo255.loan.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.aforo255.loan.model.entity.CronogramaPrestamo;
import com.app.aforo255.loan.model.entity.Transaction;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class TransactionEvent {
	
	Logger log = LoggerFactory.getLogger(TransactionEvent.class);
	@Autowired
	private IPrestamoService repository;
	@Autowired
	ObjectMapper objectMapper;
	
	public void processTransactionEvent(ConsumerRecord<Integer, String> consumerRecord) throws JsonMappingException, JsonProcessingException {
		Transaction transactionEvent = objectMapper.readValue(consumerRecord.value(), Transaction.class) ;
		log.info("transactionEvnet: {}",transactionEvent.getId() );
		CronogramaPrestamo prestamo  = repository.findById( transactionEvent.getPrestamoid() );
		prestamo.setPagado(true);
		repository.save(prestamo);
	}
}
