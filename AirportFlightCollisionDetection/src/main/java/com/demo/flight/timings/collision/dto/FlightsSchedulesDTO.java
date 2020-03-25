package com.demo.flight.timings.collision.dto;

import com.demo.flight.timings.collision.entity.FlightsSchedules;

public class FlightsSchedulesDTO {

	private FlightsSchedules flightsSchedules;

	public FlightsSchedules getFlightsSchedules() {
		return flightsSchedules;
	}

	public void setFlightsSchedules(FlightsSchedules flightsSchedules) {
		this.flightsSchedules = flightsSchedules;
	}

	public FlightsSchedulesDTO(FlightsSchedules flightsSchedules) {
		super();
		this.flightsSchedules = flightsSchedules;
	}

	public FlightsSchedulesDTO() {
		super();
	}
	
	
	
}
