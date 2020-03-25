package com.demo.flight.timings.collision.dto;

import com.demo.flight.timings.collision.entity.Airport;

public class AirportDTO {
	
	private Airport airport;

	public Airport getAirport() {
		return airport;
	}

	public void setAirport(Airport airport) {
		this.airport = airport;
	}

	public AirportDTO(Airport airport) {
		super();
		this.airport = airport;
	}
	
	public AirportDTO() {
		super();
	}

	@Override
	public String toString() {
		return "AirportDTO [airport=" + airport + "]";
	}

}
