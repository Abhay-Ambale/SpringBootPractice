package com.webapp.main.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.main.entities.Cars;
import com.webapp.main.services.CarServices;

@RestController
public class CarController {
	@Autowired
	private CarServices carServices;
	
	@GetMapping("/cars")	
	public List<Cars> getCars() {
		return this.carServices.getAllCars();
		
	}
	
//	@GetMapping("/cars/{id}")
//	public Cars getCar(@PathVariable("id") Long id) {
//		
//		return carServices.getCarById(id);
//	}

	@GetMapping("/cars/{id}")
	public ResponseEntity<Cars> getCarById(@PathVariable("id") Long id) {
				
		return carServices.getCarById(id);
	   
	}


	
	@PostMapping("/cars")
	public Cars addCars(@RequestBody Cars car) 
	{
		System.out.println("Saving car");
		this.carServices.addCar(car);
		return car;
	}
	
	
	
}
