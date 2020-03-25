package com.demo.flight.timings.collision.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.flight.timings.collision.dao.AirlineDAO;
import com.demo.flight.timings.collision.entity.Airline;
@Service
public class AirlineServiceImpl implements AirlineService {

	@Autowired
	AirlineDAO airlineDAO;
	
	@Override
	public Airline getAirLineDetailsById(Integer id) {
		List<Airline> airlineDetails = airlineDAO.findByAirlineId(id);
		if (airlineDetails != null) {
			return airlineDetails.get(0);
		} else {
			return null;
		}
	}

}
