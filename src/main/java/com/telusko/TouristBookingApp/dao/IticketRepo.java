package com.telusko.TouristBookingApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.TouristBookingApp.model.Passenger;

public interface IticketRepo extends JpaRepository<Passenger, Integer> {

}
