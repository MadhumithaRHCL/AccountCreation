package com.demo.flight.timings.collision.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Flight {

	@Id
	private Integer flightId;
	private String flightCode;
	private String flightName;
	private String flightType;
	private Integer airlineId;
	
	
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
	public Flight() {
		super();
	}
	public Integer getAirlineId() {
		return airlineId;
	}
	public void setAirlineId(Integer airlineId) {
		this.airlineId = airlineId;
	}
	public Flight(Integer flightId, String flightCode, String flightName, String flightType, Integer airlineId) {
		super();
		this.flightId = flightId;
		this.flightCode = flightCode;
		this.flightName = flightName;
		this.flightType = flightType;
		this.airlineId = airlineId;
	}
	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", flightCode=" + flightCode + ", flightName=" + flightName
				+ ", flightType=" + flightType + ", airlineId=" + airlineId + "]";
	}
	

}
