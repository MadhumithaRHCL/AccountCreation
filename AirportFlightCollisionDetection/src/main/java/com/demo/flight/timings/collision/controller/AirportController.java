package com.demo.flight.timings.collision.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.flight.timings.collision.dao.AirlineDAO;
import com.demo.flight.timings.collision.dao.AirportDAO;
import com.demo.flight.timings.collision.entity.Airline;
import com.demo.flight.timings.collision.entity.Airport;

@RestController
public class AirportController {
	
	@Autowired
	AirportDAO airportDAO;
	
	@Autowired
	AirlineDAO airlineDAO;
	
	
	@PostMapping("/airports")
	public Airport allAirports(@RequestBody Airport airport) {
		
		Airport  Airport2 =   airportDAO.save(airport);
		System.out.println(Airport2);
		return Airport2;
	}
	
	@PostMapping("/airline")
	public Airline allAirlines(@RequestBody Airline airline) {
		
		Airline  airline2 =   airlineDAO.save(airline);
		System.out.println(airline2);
		return airline2;
	}
	

}
