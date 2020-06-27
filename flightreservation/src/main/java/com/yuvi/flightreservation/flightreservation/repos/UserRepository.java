package com.yuvi.flightreservation.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuvi.flightreservation.flightreservation.entity.User;

public interface UserRepository extends JpaRepository<User,Long	>{

}
