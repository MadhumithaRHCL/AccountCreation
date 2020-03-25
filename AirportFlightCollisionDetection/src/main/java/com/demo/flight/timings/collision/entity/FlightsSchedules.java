package com.demo.flight.timings.collision.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FlightsSchedules {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer scheduleId;
	private String flightCode;
	private Integer airportId;
	private String dateTime;
	private LocalDateTime dateAndTime;
	private String type;
	private String terminal;

	public Integer getScheduleId() {
		return scheduleId;
	}

	public FlightsSchedules(Integer scheduleId, String flightCode, Integer airportId, String dateTime,
			LocalDateTime dateAndTime, String type, String terminal) {
		super();
		this.scheduleId = scheduleId;
		this.flightCode = flightCode;
		this.airportId = airportId;
		this.dateTime = dateTime;
		this.dateAndTime = dateAndTime;
		this.type = type;
		this.terminal = terminal;
	}



	public void setScheduleId(Integer scheduleId) {
		this.scheduleId = scheduleId;
	}

	public String getFlightCode() {
		return flightCode;
	}

	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public FlightsSchedules() {
		super();
	}

	public Integer getAirportId() {
		return airportId;
	}

	public void setAirportId(Integer airportId) {
		this.airportId = airportId;
	}


	public LocalDateTime getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(LocalDateTime dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getTerminal() {
		return terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}

	@Override
	public String toString() {
		return "FlightSchedule [scheduleId=" + scheduleId + ", flightCode=" + flightCode + ", airportId=" + airportId
				+ ", dateTime=" + dateTime + ", dateAndTime=" + dateAndTime + ", type=" + type + ", terminal="
				+ terminal + "]";
	}

}
