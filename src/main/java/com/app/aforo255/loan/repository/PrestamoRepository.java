package com.app.aforo255.loan.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.aforo255.loan.model.entity.CronogramaPrestamo;


@Repository
public interface PrestamoRepository extends CrudRepository<CronogramaPrestamo, Integer>{

	
}
