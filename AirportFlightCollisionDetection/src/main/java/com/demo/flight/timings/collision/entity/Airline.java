package com.demo.flight.timings.collision.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Airline {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer airlineId;	
	private String airLineName;
	
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
	
	
	public Airline() {
		super();
	}
	

}
