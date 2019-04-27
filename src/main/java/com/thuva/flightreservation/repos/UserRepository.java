package com.thuva.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thuva.flightreservation.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
