package com.demo.flight.timings.collision.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Terminal {
	
	public Terminal() {
		super();
	}
	
	@Id
	private Integer terminalId;
	private Integer airportId;
	private String scheduleId;
	private String terminalNumber;
	
	public Terminal(Integer terminalId, Integer airportId, String scheduleId, String terminalNumber) {
		super();
		this.terminalId = terminalId;
		this.airportId = airportId;
		this.scheduleId = scheduleId;
		this.terminalNumber = terminalNumber;
	}
	public Integer getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(Integer terminalId) {
		this.terminalId = terminalId;
	}
	public Integer getAirportId() {
		return airportId;
	}
	public void setAirportId(Integer airportId) {
		this.airportId = airportId;
	}
	public String getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}
	public String getTerminalNumber() {
		return terminalNumber;
	}
	public void setTerminalNumber(String terminalNumber) {
		this.terminalNumber = terminalNumber;
	}
	
	
}