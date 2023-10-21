package com.webapp.main.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Cars {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	public Cars(String brand, String model, String year, String fuel) {
		
		this.brand=brand;
		this.model=  model;
		this.year=year;
		this.fuel= fuel;
	}
	public Cars() {
		
	}
	@Override
	public String toString() {
		return "Cars [Id=" + Id + ", brand=" + brand + ", model=" + model + ", year=" + year + ", fuel=" + fuel + "]";
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	private String brand;
	private String model;
	private String year;
	private String fuel;
	
}
