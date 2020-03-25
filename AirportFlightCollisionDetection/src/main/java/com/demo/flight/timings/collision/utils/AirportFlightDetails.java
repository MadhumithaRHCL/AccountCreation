package com.demo.flight.timings.collision.utils;

import org.springframework.stereotype.Service;

import com.demo.flight.timings.collision.entity.Flight;
import com.fasterxml.jackson.annotation.JsonInclude;

@Service
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AirportFlightDetails {
	public AirportFlightDetails() {
		
	}

	private Integer airportId;
	private String airportCode;
	private String airportName;
	private String location;
	private Integer noOfRunways;
	private String airportType;
	private String terminal;
	private String type;
	private Flight flight;

	@Override
	public String toString() {
		return "AirportFlightDetails [airportId=" + airportId + ", airportCode=" + airportCode + ", airportName="
				+ airportName + ", location=" + location + ", noOfRunways=" + noOfRunways + ", airportType="
				+ airportType + ", flight=" + flight + "]";
	}

	public Integer getAirportId() {
		return airportId;
	}

	public void setAirportId(Integer airportId) {
		this.airportId = airportId;
	}

	public String getAirportCode() {
		return airportCode;
	}

	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getNoOfRunways() {
		return noOfRunways;
	}

	public void setNoOfRunways(Integer noOfRunways) {
		this.noOfRunways = noOfRunways;
	}

	public String getAirportType() {
		return airportType;
	}

	public void setAirportType(String airportType) {
		this.airportType = airportType;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public AirportFlightDetails(Integer airportId, String airportCode, String airportName, String location,
			Integer noOfRunways, String airportType, Flight flight) {
		super();
		this.airportId = airportId;
		this.airportCode = airportCode;
		this.airportName = airportName;
		this.location = location;
		this.noOfRunways = noOfRunways;
		this.airportType = airportType;
		this.flight = flight;
	}

	public String getTerminal() {
		return terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
