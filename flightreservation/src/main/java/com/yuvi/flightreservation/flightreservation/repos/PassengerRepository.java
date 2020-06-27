package com.yuvi.flightreservation.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuvi.flightreservation.flightreservation.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger,Long	>{

}
