package com.yuvi.flightreservation.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuvi.flightreservation.flightreservation.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight,Long	>{

}
