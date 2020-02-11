package com.cg.train.ticket.reservation.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;


import org.springframework.stereotype.Service;


import com.cg.train.ticket.reservation.model.User;
import com.cg.train.ticket.reservation.repository.UserRepository;

@Service
@Transactional
public class UserService {
	
	private final UserRepository userRepo;
	public UserService(UserRepository sellerRepository) {
		this.userRepo=sellerRepository;
	}
	
	public User saveUser(User user)
	{
		return userRepo.save(user);
	}
	
	public List<User> showAllUsers()
	{
		List<User> users= (List<User>) userRepo.findAll();
		return users;
	}
	
	public void deleteUser(int id)
	{
		userRepo.delete(id);
	}
	
	public User updateUser(int id)
	{
		return userRepo.findOne(id);
	}
	
	public User findByUsernameAndPassword(String username, String password) {
		return userRepo.findByUsernameAndPassword(username, password);
	}

}
