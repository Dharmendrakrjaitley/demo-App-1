package com.example.demo;

import org.hibernate.annotations.GeneratedColumn;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//Register new vehicles with details like VIN, model, year, engine type, etc.



@Entity
public class Vechile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long vin;
	private String model;
	private String engineType;
	
	
	public Vechile() {}
	
	public Vechile(long vin, String model, String engineType) {
		super();
		this.vin = vin;
		this.model = model;
		this.engineType = engineType;
	}
	public long getVin() {
		return vin;
	}
	public void setVin(long vin) {
		this.vin = vin;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	@Override
	public String toString() {
		return "Vechile [vin=" + vin + ", model=" + model + ", engineType=" + engineType + "]";
	}
	
	
	
	
}
