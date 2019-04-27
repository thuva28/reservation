package com.thuva.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thuva.flightreservation.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
