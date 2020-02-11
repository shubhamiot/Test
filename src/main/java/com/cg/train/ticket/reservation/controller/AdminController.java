package com.cg.train.ticket.reservation.controller;

import javax.servlet.http.HttpServletRequest; 

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.train.ticket.reservation.model.Admin;
import com.cg.train.ticket.reservation.model.TrainDetails;
import com.cg.train.ticket.reservation.service.AdminService;
import com.cg.train.ticket.reservation.service.TrainDetailsService;
import com.cg.train.ticket.reservation.service.UserService;

@Controller
public class AdminController {
	Logger logger= LoggerFactory.getLogger(AdminController.class);
	@Autowired
	AdminService adminservice;
	@Autowired
	UserService userservice;
	@Autowired
	TrainDetailsService tdservice;
	
	
	@RequestMapping("/loginadmin")
	public String loginAdmin(HttpServletRequest request)
	{
		request.setAttribute("mode", "MODE_LOGINADMIN");
		return "adminlogin";
	}
	
	@RequestMapping("/login-admin")
	public String checkAdmin(@ModelAttribute Admin admin,@ModelAttribute TrainDetails td, HttpServletRequest request)
	{
		if(adminservice.findByUsernameAndPassword(admin.getUsername(), admin.getPassword())!=null)
		{
			request.setAttribute("mode", "ALL_U");
			request.setAttribute("trains",tdservice.listAll());
			return "admin";
		}
		else
		{
			request.setAttribute("error", "invalid username and password");
			request.setAttribute("mode", "MODE_LOGINADMIN");
			return "adminlogin";
		}
	}
	
	@RequestMapping("/newtrain")
	public String EnterDetails(HttpServletRequest request) {
		
		request.setAttribute("mode", "NEW_TRAIN");
		return "traindetrailsenter";
	}
	
	@RequestMapping("/savetrain")
	public String addtrains(@ModelAttribute TrainDetails tdetails, BindingResult bindingResult,HttpServletRequest request )
	{
		tdservice.save(tdetails);
		request.setAttribute("trains",tdservice.listAll());
		request.setAttribute("mode", "ALL_U");
		return "admin";
	}
	
	@RequestMapping("/deletetrain")
	public String deleteProduct(@RequestParam int id,@ModelAttribute TrainDetails td, HttpServletRequest request) {
	    tdservice.deletetrain(id);
	    request.setAttribute("trains", tdservice.listAll());
	    request.setAttribute("mode", "ALL_U");
	    return "admin";       
	}
}
