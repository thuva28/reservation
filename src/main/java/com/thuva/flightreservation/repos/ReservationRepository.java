package com.thuva.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thuva.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
