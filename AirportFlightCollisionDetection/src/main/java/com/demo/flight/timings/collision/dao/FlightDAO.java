package com.demo.flight.timings.collision.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.flight.timings.collision.entity.Flight;

public interface FlightDAO extends JpaRepository<Flight, Integer> {

	Flight findByFlightCode(String flightCode);
}
