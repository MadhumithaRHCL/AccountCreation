package com.demo.flight.timings.collision.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.flight.timings.collision.dto.FlightsSchedulesDTO;
import com.demo.flight.timings.collision.response.ResponseObject;
import com.demo.flight.timings.collision.service.FlightScheduleServiceImpl;
import com.demo.flight.timings.collision.utils.AirlineFlightDetails;
import com.demo.flight.timings.collision.utils.AirportFlightDetails;


@RestController
public class FlightsScheduleController {
	
	@Autowired(required = true)
	FlightScheduleServiceImpl flightScheduleServiceImpl;
	
	
	@PostMapping("/scheduleFlights")
	public ResponseEntity<ResponseObject> allSchedules(@RequestBody FlightsSchedulesDTO schedules) {
		ResponseObject  responseObject = flightScheduleServiceImpl.flightsSchedules(schedules.getFlightsSchedules());	
		return new ResponseEntity<ResponseObject>(responseObject, HttpStatus.OK);
	}
	
	
	
	  @GetMapping("/airports/{airportId}") 
	  public List<AirportFlightDetails> allFlightsOnAirport(@PathVariable Integer airportId){
	  List<AirportFlightDetails> flightDetails=flightScheduleServiceImpl.getAirportDetails(airportId);
	  return flightDetails;
	  }
	 
	
	@GetMapping("/flightCode/{flightCode}")
	public AirlineFlightDetails allFlightsByFlightCOde(@PathVariable String flightCode){	
		AirlineFlightDetails flightDetails= flightScheduleServiceImpl.getFlightDetails(flightCode);
		return flightDetails;
	}
	
}
