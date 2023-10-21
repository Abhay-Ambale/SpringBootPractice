package com.webapp.main.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.webapp.main.dao.CarsRepo;
import com.webapp.main.entities.Cars;
@Service
@Component
public class CarServices {
	
	private final CarsRepo carRepository;

	 @Autowired
	    public CarServices(CarsRepo carRepository) {
	        this.carRepository = carRepository;
	    }
	private static List<Cars> list = new ArrayList<>();
	
	static {
		
		list.add(new Cars("AUDI","A7","2015","Petrol"));
		list.add(new Cars("SKODA","Octavia","2019","Diesel"));
		list.add(new Cars("Mahindra","Thar","2022","Diesel"));
		list.add(new Cars("Mercedes","G wagon","2018","Petrol"));
	}
	
	//Get all Cars
	public List<Cars> getAllCars(){
		return list;
	}
	
	//get single book by ID
	public Cars getCarById(Long id) {
		Cars cars = null;
		list.stream().filter(e-> e.getId()==id).findFirst().get();
		return cars;		
	}
	
	//save single cars
	public void saveCar(Cars car) {
        carRepository.save(car);
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
