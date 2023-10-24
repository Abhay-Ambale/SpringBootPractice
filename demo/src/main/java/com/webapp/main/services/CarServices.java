package com.webapp.main.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.webapp.main.dao.CarsRepo;
import com.webapp.main.entities.Cars;
@Service
@Component
public class CarServices {
	
	private final CarsRepo carRepository;

	 public CarServices(CarsRepo carRepository) {
	        this.carRepository = carRepository;
	    }
	private static List<Cars> list = new ArrayList<>();
	
	//Adding a car externally
	public void addCar(Cars b) {
		carRepository.save(b);
		System.out.println("Car saved");
		}
	
	//Get all Cars
	public List<Cars> getAllCars(){
		return list;
	}
	
	//get single book by ID
	public ResponseEntity<Cars> getCarById(Long id) {
		 Optional<Cars> car = carRepository.findById(id);
		    
		    if (car.isPresent()) {
		        return new ResponseEntity<>(car.get(), HttpStatus.OK);
		    } else {
		        System.out.println("Car not found");
		        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		    }		
	}	
	

	//save all cars
    public void saveAllCars(List<Cars> list) {
        try {
			carRepository.saveAll(list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
