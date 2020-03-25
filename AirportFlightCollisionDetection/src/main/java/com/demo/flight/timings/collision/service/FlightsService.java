package com.demo.flight.timings.collision.service;

import com.demo.flight.timings.collision.entity.Flight;

public interface FlightsService {
	
	public Flight getDetailsByFlightCode(String flightId);

}
