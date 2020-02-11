package com.cg.train.ticket.reservation.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cg.train.ticket.reservation.model.Book;
import com.cg.train.ticket.reservation.repository.BookRespository;
import com.cg.train.ticket.reservation.service.BookService;


@Controller

public class BookController {	
	@Autowired
	private BookService bookservice;
	@RequestMapping(path="/booking")
	public String Welcome(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_HOMEPAGE");
		return "welcomepage";
	}
	
	@RequestMapping(path="/savebooking")
	public String saveBooking(@ModelAttribute Book book,BindingResult bindingResult, HttpServletRequest request )
	{
		bookservice.save(book);
		request.setAttribute("mode", "MODE_BOOKING");
		return "bookingpage";
	}
	
	@RequestMapping(path="/deletebooking")
	public String deleteBooking(@RequestParam Integer pnr, HttpServletRequest request)
	{
		bookservice.delete(pnr);
		request.setAttribute("mode", "MODE_DELETEBOOKING");
		return "bookingpage";
		
	}
//	@RequestMapping(path="/searchbypnr")
//	public String Search(@ModelAttribute Book book, BindingResult bindingresult, HttpServletRequest request)
//	{
//		if(bookservice.findOne(book.getPnr())!=null)
//		{
//			request.setAttribute("mode", "MODE_SEARCHPNR");
//			return "searchpnrpage";
//		}
//		else
//		{
//			request.setAttribute("error", "invalid pnr it does not exist");
//		return "invalidpage";
//		}
//		request.setAttribute("mode", "MODE_SEARCHPNR");
//		return "searchpnrpage";
//		
//	}
	
}
