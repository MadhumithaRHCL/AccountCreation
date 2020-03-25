package com.demo.flight.timings.collision.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.flight.timings.collision.entity.FlightsSchedules;
import com.demo.flight.timings.collision.response.ResponseObject;
import com.demo.flight.timings.collision.utils.AirlineFlightDetails;
import com.demo.flight.timings.collision.utils.AirportFlightDetails;

@Service
public interface FlightScheduleService {

	public ResponseObject flightsSchedules(FlightsSchedules schedule);
	
	List<AirportFlightDetails> getAirportDetails(Integer airportId);

	AirlineFlightDetails getFlightDetails(String flightCode);

}
