package com.demo.flight.timings.collision.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.flight.timings.collision.dao.FlightScheduleDAO;
import com.demo.flight.timings.collision.entity.Airline;
import com.demo.flight.timings.collision.entity.Airport;
import com.demo.flight.timings.collision.entity.Flight;
import com.demo.flight.timings.collision.entity.FlightsSchedules;
import com.demo.flight.timings.collision.response.ResponseObject;
import com.demo.flight.timings.collision.utils.AirlineFlightDetails;
import com.demo.flight.timings.collision.utils.AirportFlightDetails;
import com.demo.flight.timings.collision.utils.BuildResponse;
@Service
public class FlightScheduleServiceImpl implements FlightScheduleService {

	@Autowired
	FlightScheduleDAO flightScheduleDAO;
	@Autowired
	BuildResponse buildResponse;
	@Autowired
	AirportFlightDetails airportFlightDetails;
	@Autowired
	AirportServiceImpl airportServiceImpl;
	@Autowired
	FlightServiceImpl flightServiceImpl;
	@Autowired
	AirlineServiceImpl airlineServiceImpl;

	@Override
	public ResponseObject flightsSchedules(FlightsSchedules schedule) {
		schedule.setDateAndTime(convertDateTime(schedule.getDateTime()));
		FlightsSchedules savedSchedule = null;
		Boolean status = 	isFlightAvailableOnTerminal(schedule);
		System.out.println("Status = " +status);
		if(!status) {
			savedSchedule =  flightScheduleDAO.save(schedule);
		}	
		return buildResponse.createResponseObject(savedSchedule);
	}

	public LocalDateTime convertDateTime(String time) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime dateTime = LocalDateTime.parse(time, formatter);
		System.out.println("dateTime = "+dateTime);
		return dateTime;

	}

	public boolean isFlightAvailableOnTerminal(FlightsSchedules schedule) {
		boolean isEqual = false;
		List<FlightsSchedules> scheduledlist = flightScheduleDAO.findByTerminal(schedule.getTerminal());
		if (!(scheduledlist.isEmpty())) {
			System.out.println("scheduledlist = " + scheduledlist);
			for (FlightsSchedules list : scheduledlist) {
				isEqual = (schedule.getDateAndTime()).isEqual(list.getDateAndTime());
				if(isEqual)
				break;
			}
		}
		return isEqual;
	}

	

	@Override
	public List<AirportFlightDetails> getAirportDetails(Integer airportId) {
		List<FlightsSchedules> airportList = 	flightScheduleDAO.findByAirportId(airportId);	
		System.out.println("size"+ airportList.size());
		List<AirportFlightDetails> airportFlightDetails = new ArrayList<AirportFlightDetails>();
		
		
		for(FlightsSchedules list :airportList) 
		{
			AirportFlightDetails airportFlight = new AirportFlightDetails();
			Flight flight = new Flight();
			Airport airportDetails = airportServiceImpl.getAirportDetails(list.getAirportId());
			Flight flightDetails = flightServiceImpl.getDetailsByFlightCode(list.getFlightCode());
			airportFlight.setAirportId(airportDetails.getAirportId());
			airportFlight.setAirportCode(airportDetails.getAirportCode());
			airportFlight.setAirportName(airportDetails.getAirportName());
			airportFlight.setTerminal(list.getTerminal());		
			flight.setFlightCode(flightDetails.getFlightCode());
			flight.setFlightName(flightDetails.getFlightName());
			airportFlight.setFlight(flight);
			airportFlightDetails.add(airportFlight);
		}
		
		return airportFlightDetails;
	}

	@Override
	public AirlineFlightDetails  getFlightDetails(String flightCode) {
		Airline airlineDetails = null;
		Flight flightDetails = flightServiceImpl.getDetailsByFlightCode(flightCode);
		if(flightDetails!=null) {
		airlineDetails = airlineServiceImpl.getAirLineDetailsById(flightDetails.getAirlineId());}	
		AirlineFlightDetails airportFlightDetails = new AirlineFlightDetails();
		if(airlineDetails!=null) {
			airportFlightDetails.setAirlineId(flightDetails.getAirlineId());
			airportFlightDetails.setAirLineName(airlineDetails.getAirLineName());
			airportFlightDetails.setFlightType(flightDetails.getFlightType());
			airportFlightDetails.setFlightCode(flightDetails.getFlightCode());	
		}
		return airportFlightDetails;
	}

	

}
