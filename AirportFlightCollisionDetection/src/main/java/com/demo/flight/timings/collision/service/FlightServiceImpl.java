package com.demo.flight.timings.collision.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.flight.timings.collision.dao.FlightDAO;
import com.demo.flight.timings.collision.entity.Flight;
@Service
public class FlightServiceImpl implements FlightsService {

	@Autowired
	FlightDAO flightDAO;
	
	@Override
	public Flight getDetailsByFlightCode(String flightCode) {
	Flight flightDetails = flightDAO.findByFlightCode(flightCode);
		return flightDetails;
	}

	

}
