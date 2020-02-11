package com.cg.train.ticket.reservation.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;  

import org.eclipse.jdt.core.compiler.InvalidInputException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.cg.train.ticket.reservation.model.Book;
import com.cg.train.ticket.reservation.model.TrainDetails;
import com.cg.train.ticket.reservation.model.User;
import com.cg.train.ticket.reservation.service.BookService;
import com.cg.train.ticket.reservation.service.TrainDetailsService;
import com.cg.train.ticket.reservation.service.UserService;

@Controller
public class UserController {
	
@Autowired
UserService userService;
@Autowired
BookService bookService;
@Autowired
TrainDetailsService tdservice;
@RequestMapping(path="/register")
public String registraion(HttpServletRequest request)
{
	request.setAttribute("mode", "MODE_REGISTER");
	return "registerpage";
}
@RequestMapping(path="/saveuser")
public String registerUser(@ModelAttribute User user, BindingResult bindingResult, HttpServletRequest request)
{
	userService.saveUser(user);
	request.setAttribute("mode", "MODE_LOGIN");
	return "welcomepage";
}
@RequestMapping(path="/deleteuser")
public String deleteUser(@RequestParam Integer id, HttpServletRequest request)
{
	userService.deleteUser(id);
	request.setAttribute("users", userService.showAllUsers());
	request.setAttribute("mode", "ALL_USERS");
	return "registerpage";
}

@RequestMapping("/login")
public String login(HttpServletRequest request)
{
	request.setAttribute("mode", "MODE_LOGIN");
	return "loginpage";
}

@RequestMapping ("/loginuser")
public String loginUser(@ModelAttribute Book book,@ModelAttribute User user,BindingResult bindingresult, HttpServletRequest request) {
	if(userService.findByUsernameAndPassword(user.getUsername(), user.getPassword())!=null) {
		request.setAttribute("bookings", bookService.findAll());
		request.setAttribute("mode", "ALL_BOOKING");
		return "showbooking";
	}
	else {
		request.setAttribute("error", "Invalid Username or Password");
		request.setAttribute("mode", "MODE_LOGIN");
		return "loginpage";
	}
}
	
	@RequestMapping("/dobooking")
	public String dobooking(@ModelAttribute TrainDetails td, HttpServletRequest request)
	{
		request.setAttribute("trains",tdservice.listAll());
		request.setAttribute("mode", "ALL_U");
		return "bookingpage";
	}
	
	@RequestMapping("/booktrain")
	public String add(@ModelAttribute Book b,HttpServletRequest request,@RequestParam int id)
	{
		request.setAttribute("mode", "CNF_BOOKING");
		request.setAttribute("train", tdservice.get(id));
		return "confirm";
	}
//	@RequestMapping("/savedview")
//	public String viewone(@ModelAttribute Book book,HttpServletRequest request)
//	{
//		bookService.save(book);
//		return "view";
//	}
//	
	@RequestMapping("/savetocart")
	public String additems(@ModelAttribute Book book,@RequestParam int trainno,HttpServletRequest request)
	{
		bookService.save(book);
		request.setAttribute("mode", "ALL_ITEMS");
		request.setAttribute("items", bookService.findOne(trainno));
		return "cart";
	}
	
	@RequestMapping("/deleteitemfromcart")
	public String deleteitem(@RequestParam int pnr, HttpServletRequest request)
	{
		bookService.deleteitem(pnr);
		request.setAttribute("items", bookService.findAll());
		request.setAttribute("mode", "ALL_ITEMS");
		return "cart";
	}
	
	@RequestMapping("/buyitems")
	public String sumofprice(@ModelAttribute Book book, HttpServletRequest request)
	{
//		request.setAttribute("mode","ALL_PRICE");
//		request.setAttribute("items", cartService.listAll());
		bookService.getPrice();
		List<Object[]> pricelist=bookService.getPrice();
		request.setAttribute("price", pricelist);
		return "sumprice";
	}
	@RequestMapping("/back")
	public String finall(@ModelAttribute Book book,HttpServletRequest request)
	{
		request.setAttribute("bookings", bookService.findAll());
		request.setAttribute("mode", "ALL_BOOKING");
		return "showbooking";
	}
}


