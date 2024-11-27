package com.telusko.TouristBookingApp.model;


public class Ticket {
	
	
	private Integer ticketNumber;
	
	private String status;
	
	private Double ticketCost;
	
    private String name;
	
	private String departure;
	
	private String Arrival;
	
	private String dateOfJourney;

	public Integer getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(Integer ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(Double ticketCost) {
		this.ticketCost = ticketCost;
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

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Ticket [ticketNumber=" + ticketNumber + ", status=" + status + ", ticketCost=" + ticketCost + ", name="
				+ name + ", departure=" + departure + ", Arrival=" + Arrival + ", dateOfJourney=" + dateOfJourney + "]";
	}
	
	
	

}
