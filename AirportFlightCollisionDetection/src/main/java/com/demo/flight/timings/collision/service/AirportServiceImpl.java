package com.demo.flight.timings.collision.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.flight.timings.collision.dao.AirportDAO;
import com.demo.flight.timings.collision.entity.Airport;
@Service
public class AirportServiceImpl implements AirportService {

	@Autowired
	AirportDAO airportDAO;
	
	
	@Override
	public Airport getAirportDetails(Integer airportId) {
		
		Airport details = airportDAO.findByAirportId(airportId);
		System.out.println("airport Details = "+details);
		return details;
	}

}
