package com.app.aforo255.loan.service;

import java.util.List;

import com.app.aforo255.loan.model.entity.CronogramaPrestamo;

public interface IPrestamoService {
	public List<CronogramaPrestamo> findAll();
	public CronogramaPrestamo findById(Integer id);
	public CronogramaPrestamo save(CronogramaPrestamo o);

}
