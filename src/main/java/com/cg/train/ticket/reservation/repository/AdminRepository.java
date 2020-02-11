package com.cg.train.ticket.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.train.ticket.reservation.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

	public Admin findByUsernameAndPassword(String username, String password);

}
