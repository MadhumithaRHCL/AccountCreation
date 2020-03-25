package com.demo.flight.timings.collision.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.flight.timings.collision.entity.Airport;
@Repository
public interface AirportDAO extends JpaRepository<Airport, Integer> {

	public Airport findByAirportId(Integer airportId);
}


