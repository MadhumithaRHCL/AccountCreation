package com.demo.flight.timings.collision.utils;

import org.springframework.stereotype.Service;

import com.demo.flight.timings.collision.entity.FlightsSchedules;
import com.demo.flight.timings.collision.service.FlightScheduleServiceImpl;

@Service
public class TestUtils {

	FlightsSchedules flightsSchedules = new FlightsSchedules();
	FlightScheduleServiceImpl flightScheduleServiceImpl = new FlightScheduleServiceImpl();
	
	public FlightsSchedules createFlightsSchedulesMockObject() {
		flightsSchedules.setScheduleId(1);
		flightsSchedules.setFlightCode("8uwiZA");
		flightsSchedules.setAirportId(1);
		flightsSchedules.setDateTime("2020-03-24 23:38");
		flightsSchedules.setDateAndTime(flightScheduleServiceImpl.convertDateTime(flightsSchedules.getDateTime()));
		flightsSchedules.setType("Departure");
		flightsSchedules.setTerminal("1D");
		return flightsSchedules;
	}

}
