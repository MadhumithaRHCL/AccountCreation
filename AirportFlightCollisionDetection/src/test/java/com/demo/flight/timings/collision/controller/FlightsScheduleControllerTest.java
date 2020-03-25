package com.demo.flight.timings.collision.controller;
import static org.junit.jupiter.api.Assertions.assertNotNull;


import java.util.ArrayList;
import java.util.List;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.demo.flight.timings.collision.entity.Airline;
import com.demo.flight.timings.collision.entity.Flight;
import com.demo.flight.timings.collision.service.FlightScheduleService;
import com.demo.flight.timings.collision.utils.AirlineFlightDetails;
import com.demo.flight.timings.collision.utils.AirportFlightDetails;

@AutoConfigureTestDatabase(replace = Replace.NONE)
@DataJpaTest
public class FlightsScheduleControllerTest {
	
	@InjectMocks
	FlightsScheduleController flightsScheduleController;
	
	@Mock
	FlightScheduleService flightScheduleService;
	
	 AirlineFlightDetails airlineFlightDetails = null;
	    Flight flight = null;
	    Airline airline = null;

	 

	    @Before(value=" ")
	    public void before() {

	        flight = new Flight();
	        airline = new Airline();

	        flight.setAirlineId(1);
	        flight.setFlightType("International");
	 
	        airlineFlightDetails = new AirlineFlightDetails();
	        airlineFlightDetails.setAirlineId(1);
	        airlineFlightDetails.setAirLineName("Indigo");
	        airlineFlightDetails.setFlightCode("U56F");
	        airlineFlightDetails.setFlightId(1);
	        airlineFlightDetails.setFlightName("INF786");
	        airlineFlightDetails.setFlightType("International");

	        airline.setAirlineId(1);
	        airline.setAirLineName("Abc");

	    }

	 

	    @Test
	    public void getAllDetailsTest() {

	 

	        String flightCode = "U56F";

	 

	        Mockito.when(flightScheduleService.getFlightDetails(flightCode)).thenReturn(airlineFlightDetails);
	        AirlineFlightDetails airlineFlightDetails1 = flightsScheduleController.allFlightsByFlightCOde(flightCode);
	        assertNotNull(airlineFlightDetails1);
	    }
	 

	 
	 @Test
	 public void allFlightsOnAirportTest()
		{
			 List<Flight> list2=new ArrayList<Flight>(); 
			 Flight flight=new Flight();
			  flight.setFlightCode("G23"); flight.setFlightName("Air Asia");
			  list2.add(flight);
			  
			  List<AirportFlightDetails> list3=new ArrayList<>(); AirportFlightDetails
			  airportFlightDetails=new AirportFlightDetails();
			  airportFlightDetails.setFlight(flight); airportFlightDetails.setAirportId(1);
			  airportFlightDetails.setAirportCode("BNG21");
			  airportFlightDetails.setAirportName("Bengalore International Airport");
			  airportFlightDetails.setTerminal("1D"); list3.add(airportFlightDetails);
		 
		Mockito.when(flightScheduleService.getAirportDetails(1)).thenReturn(list3);
		 List<AirportFlightDetails> airportFlightDetails2=flightsScheduleController.allFlightsOnAirport(1);
		 //assertTrue(airportFlightDetails2.equals(list3));
		// assertNull(airportFlightDetails2);
		assertNotNull(airportFlightDetails2);
		 
	 }
	 
	
}
