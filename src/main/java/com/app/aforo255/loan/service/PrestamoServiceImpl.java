package com.app.aforo255.loan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.aforo255.loan.model.entity.CronogramaPrestamo;
import com.app.aforo255.loan.repository.PrestamoRepository;


@Service 
public class PrestamoServiceImpl implements IPrestamoService {
	
	@Autowired
	private PrestamoRepository repository;

	@Override
	@Transactional(readOnly = true)
	public List<CronogramaPrestamo> findAll() {
	
		return (List<CronogramaPrestamo>) repository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public CronogramaPrestamo findById(Integer id) {
		return (CronogramaPrestamo) repository.findById(id).orElse(null);
	}

	@Override
	public CronogramaPrestamo save(CronogramaPrestamo account) {
		return repository.save(account);
	}
	
}
