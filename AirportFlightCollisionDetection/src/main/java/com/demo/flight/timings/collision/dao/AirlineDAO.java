package com.demo.flight.timings.collision.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.flight.timings.collision.entity.Airline;
@Repository
public interface AirlineDAO extends JpaRepository<Airline, Integer> {

	public  List<Airline> findByAirlineId(Integer airlineId);
	
}
