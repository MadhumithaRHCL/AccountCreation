package com.demo.flight.timings.collision.dto;

import com.demo.flight.timings.collision.entity.Flight;

public class FlightDTO {

	private Flight flight;

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	@Override
	public String toString() {
		return "FlightDTO [flight=" + flight + "]";
	}

	public FlightDTO(Flight flight) {
		super();
		this.flight = flight;
	}
	public FlightDTO() {
		super();
	}
}
