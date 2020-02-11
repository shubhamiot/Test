package com.cg.train.ticket.reservation.service;


import org.springframework.stereotype.Service;

import com.cg.train.ticket.reservation.model.Admin;
import com.cg.train.ticket.reservation.repository.AdminRepository;
@Service
public class AdminService {
	private  final AdminRepository adminRepository;
	
	 public AdminService(AdminRepository adminRepository) {
		this.adminRepository=adminRepository;
	}
	 public Admin findByUsernameAndPassword(String username, String password) {
			return adminRepository.findByUsernameAndPassword(username, password);
		}

}
