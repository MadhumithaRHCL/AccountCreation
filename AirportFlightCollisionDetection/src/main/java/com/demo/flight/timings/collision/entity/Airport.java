package com.demo.flight.timings.collision.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Airport {
	
	public Airport()
	{
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer airportId;
	private String airportCode;
	private String airportName;
	private String location;
	private Integer noOfRunways;
	private String airportType;
	
	
	
	
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
	@Override
	public String toString() {
		return "Airport [airportId=" + airportId + ", airportCode=" + airportCode + ", airportName=" + airportName
				+ ", location=" + location + ", noOfRunways=" + noOfRunways + ", airportType=" + airportType + "]";
	}
	
	
}
