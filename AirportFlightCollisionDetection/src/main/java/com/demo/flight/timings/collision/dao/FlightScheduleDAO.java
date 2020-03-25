package com.demo.flight.timings.collision.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.flight.timings.collision.entity.FlightsSchedules;

@Repository
public interface FlightScheduleDAO extends JpaRepository<FlightsSchedules, Integer> {

	public List <FlightsSchedules> findByTerminal(String terminal);

	public List<FlightsSchedules> findByAirportId(Integer airportId);

	
	
	

}
