package com.cg.train.ticket.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository; 


import com.cg.train.ticket.reservation.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByUsernameAndPassword(String username, String password);




}
