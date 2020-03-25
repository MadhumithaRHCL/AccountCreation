package com.demo.flight.timings.collision.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.demo.flight.timings.collision.dao.FlightScheduleDAO;
import com.demo.flight.timings.collision.entity.Airline;
import com.demo.flight.timings.collision.entity.Flight;
import com.demo.flight.timings.collision.entity.FlightsSchedules;
import com.demo.flight.timings.collision.utils.AirlineFlightDetails;
import com.demo.flight.timings.collision.utils.AirportFlightDetails;


@AutoConfigureTestDatabase(replace = Replace.NONE)
@DataJpaTest

class FlightScheduleServiceImplTest {
	
	

	@InjectMocks
	FlightScheduleServiceImpl flightScheduleServiceImpl;
	
	@Mock
	FlightScheduleDAO flightScheduleDAO;
	
	@Mock
	FlightServiceImpl flightServiceImpl;
	
	@Mock
	AirlineServiceImpl airlineServiceImpl;
	
	 @Before(value = "")
	    public void init() {
	        MockitoAnnotations.initMocks(this);
	    }
	 	

	@Test
	void testFlightsSchedules() {
		 List<FlightsSchedules> schedules = new ArrayList<FlightsSchedules>();
		
		 FlightsSchedules flightsSchedules = new FlightsSchedules(1,"8uwiZA",1,"2020-03-24 23:38",
				 	flightScheduleServiceImpl.convertDateTime("2020-03-24 23:38"),"Departure","1D");
		 
		 schedules.add(flightsSchedules);
		 
		when(flightScheduleDAO.findByTerminal("1D")).thenReturn(schedules);
		
		List<FlightsSchedules> schedules2 = flightScheduleDAO.findByTerminal("1D");
		assertEquals(1,schedules2.size());
		verify(flightScheduleDAO, times(1)).findByTerminal("1D");
		
	}

	
	 @Test void testConvertDateTime() { 
		 
		 LocalDateTime localDateTime =  flightScheduleServiceImpl.convertDateTime("2020-03-24 23:38");
		 LocalDateTime localDateTimeTest = LocalDateTime.parse("2020-03-24T23:38");
		 System.out.println("localDateTime" +localDateTime);
		 System.out.println("localDateTimeTest" + localDateTimeTest);
		 assertTrue(localDateTime.isEqual(localDateTimeTest)); 
	 }
	
	 @Disabled
	  @Test void testIsFlightAvailableOnTerminal() { FlightsSchedules
	  FlightsSchedules = new FlightsSchedules();
	  
	  List<FlightsSchedules> scheduledlist =  flightScheduleDAO.findByTerminal("1D");
	  
	  }
	 
	 @Test
	 public void getAirportDetailsTest()
	 {
		 List<FlightsSchedules>flightsSchedules=new ArrayList<>();
		 List<Flight> list2=new ArrayList<Flight>();
		 Flight flight=new Flight();
		 flight.setFlightCode("G23");
		 flight.setFlightName("Air Asia");
		 list2.add(flight);
		 
		 List<AirportFlightDetails> list3=new ArrayList<>();
		 AirportFlightDetails airportFlightDetails=new AirportFlightDetails();
		 airportFlightDetails.setFlight(flight);
		 airportFlightDetails.setAirportId(1);
		 airportFlightDetails.setAirportCode("BNG21");
		 airportFlightDetails.setAirportName("Bengalore International Airport");
		 airportFlightDetails.setTerminal("1D");
		 list3.add(airportFlightDetails);
		 
		 
		 Mockito.when(flightScheduleDAO.findByAirportId(1)).thenReturn(flightsSchedules);
		 List<AirportFlightDetails> airportFlightDetails2=flightScheduleServiceImpl.getAirportDetails(1);
		 assertNotNull(airportFlightDetails2);
		 assertTrue(airportFlightDetails2.equals(flightsSchedules));
		
	 }
	 
	 
	 @Test
	    public void getFlightDetailsTest() {

	 

	        Flight flight = new Flight();
	        Airline airline=new Airline();
	        flight.setAirlineId(1);
	        flight.setFlightType("International");

	 

	        AirlineFlightDetails airlineFlightDetails = new AirlineFlightDetails();
	        airlineFlightDetails.setAirlineId(1);
	        airlineFlightDetails.setAirLineName("Indigo");
	        airlineFlightDetails.setFlightCode("U56F");
	        airlineFlightDetails.setFlightId(1);
	        airlineFlightDetails.setFlightName("INF786");
	        airlineFlightDetails.setFlightType("International");
	        
	        airline.setAirlineId(1);
	        airline.setAirLineName("Abc");
	        
	        Mockito.when(flightServiceImpl.getDetailsByFlightCode("U56F")).thenReturn(flight);
	        Mockito.when(airlineServiceImpl.getAirLineDetailsById(1)).thenReturn(airline);

	 

	        AirlineFlightDetails airlineFlightDetails2 = flightScheduleServiceImpl.getFlightDetails("U56F");
	        assertNotNull(airlineFlightDetails2);
	    }
	

}
