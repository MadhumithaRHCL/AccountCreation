package com.demo.flight.timings.collision.dto;

import com.demo.flight.timings.collision.entity.Airline;

public class AirlineDTO {

	private Airline airline;

	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}

	@Override
	public String toString() {
		return "AirlineDTO [airline=" + airline + "]";
	}

	public AirlineDTO(Airline airline) {
		super();
		this.airline = airline;
	}
	
	public AirlineDTO() {
		super();
	}
	
}
