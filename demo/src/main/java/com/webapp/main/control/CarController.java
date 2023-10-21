package com.webapp.main.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.webapp.main.entities.Cars;
import com.webapp.main.services.CarServices;

@RestController
public class CarController {
	@Autowired
	private CarServices carServices;
	
	@GetMapping("/cars")	
	public List<Cars> getCars() {
		
		carServices.saveAllCars(this.carServices.getAllCars());
		return this.carServices.getAllCars();
		
	}
	
	@GetMapping("/cars/{id}")
	public Cars getCar(@PathVariable("id") Long id) {
		return carServices.getCarById(id);
	}
	
}
