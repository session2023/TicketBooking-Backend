package com.telusko.TouristBookingApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Passenger {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer pid;
	
	private String name;
	
	private String departure;
	
	private String Arrival;
	
	private String dateOfJourney;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getArrival() {
		return Arrival;
	}

	public void setArrival(String arrival) {
		Arrival = arrival;
	}

	public String getDateOfJourney() {
		return dateOfJourney;
	}

	public void setDateOfJourney(String dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}

	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passenger(Integer pid, String name, String departure, String arrival, String dateOfJourney) {
		super();
		this.pid = pid;
		this.name = name;
		this.departure = departure;
		Arrival = arrival;
		this.dateOfJourney = dateOfJourney;
	}

	@Override
	public String toString() {
		return "Passenger [pid=" + pid + ", name=" + name + ", departure=" + departure + ", Arrival=" + Arrival
				+ ", dateOfJourney=" + dateOfJourney + "]";
	}
	
	
	

}
