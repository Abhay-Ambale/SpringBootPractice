package com.webapp.main.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webapp.main.entities.Cars;
@Repository
public interface CarsRepo extends CrudRepository<Cars, Long> {

}
