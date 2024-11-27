package com.telusko.TouristBookingApp.service;

import com.telusko.TouristBookingApp.model.Passenger;

public interface ITicketBookingService {
	
	public Passenger registerPassenger(Passenger passenger);
	public Passenger fetchPassengerInfo(Integer id);

}
