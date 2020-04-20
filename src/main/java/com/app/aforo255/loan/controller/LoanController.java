package com.app.aforo255.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.aforo255.loan.model.entity.CronogramaPrestamo;
import com.app.aforo255.loan.service.IPrestamoService;
import com.fasterxml.jackson.core.JsonProcessingException;


@RestController
public class LoanController {
	@Autowired
	private IPrestamoService service;
	
	@GetMapping("listar")
	public List<CronogramaPrestamo> listar() {
		return service.findAll();
	}
	
	@GetMapping("ver/{id}")
	public CronogramaPrestamo detalle( @PathVariable Integer id) {
		return service.findById(id);
	}
	
	@PostMapping("/crear")
	public ResponseEntity<CronogramaPrestamo> postLibraryEvent(@RequestBody CronogramaPrestamo prestamo) throws JsonProcessingException{
		CronogramaPrestamo o = service.save(prestamo);
		return ResponseEntity.status(HttpStatus.CREATED).body(o);
	}
	
}
