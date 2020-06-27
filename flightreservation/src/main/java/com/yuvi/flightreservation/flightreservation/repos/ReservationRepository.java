package com.yuvi.flightreservation.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuvi.flightreservation.flightreservation.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Long	>{

}
