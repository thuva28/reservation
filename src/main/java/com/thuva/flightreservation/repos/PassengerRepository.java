package com.thuva.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thuva.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
