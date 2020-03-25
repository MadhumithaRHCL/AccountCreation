package com.demo.flight.timings.collision.utils;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonInclude;

@Service
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AirlineFlightDetails {
	
	public AirlineFlightDetails() {
		super();
	}
	private Integer airlineId;	
	private String airLineName;
	private Integer flightId;
	private String flightCode;
	private String flightName;
	private String flightType;
	@Override
	public String toString() {
		return "AirlineFlightDetails [airlineId=" + airlineId + ", airLineName=" + airLineName + ", flightId="
				+ flightId + ", flightCode=" + flightCode + ", flightName=" + flightName + ", flightType=" + flightType
				+ "]";
	}
	public Integer getAirlineId() {
		return airlineId;
	}
	public void setAirlineId(Integer airlineId) {
		this.airlineId = airlineId;
	}
	public String getAirLineName() {
		return airLineName;
	}
	public void setAirLineName(String airLineName) {
		this.airLineName = airLineName;
	}
	public Integer getFlightId() {
		return flightId;
	}
	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}
	public String getFlightCode() {
		return flightCode;
	}
	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getFlightType() {
		return flightType;
	}
	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}
	public AirlineFlightDetails(Integer airlineId, String airLineName, Integer flightId, String flightCode,
			String flightName, String flightType) {
		super();
		this.airlineId = airlineId;
		this.airLineName = airLineName;
		this.flightId = flightId;
		this.flightCode = flightCode;
		this.flightName = flightName;
		this.flightType = flightType;
	}
	

}
