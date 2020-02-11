package com.cg.train.ticket.reservation.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.train.ticket.reservation.model.Book;
import com.cg.train.ticket.reservation.repository.BookRespository;

@Service
@Transactional
public class BookService {
	@Autowired
	private BookRespository bookrepo;
	
	// to generate the booking
	public Book save(Book b)
	{
		return bookrepo.save(b);
	}
	// to see all the booking
	public List<Book> findAll()
	{
		return (List<Book>) bookrepo.findAll();
	}
	
	public Book findOne(int trainno)
	{
		return bookrepo.findOne(trainno);
	}
	
	public void delete(int b)
	{
		bookrepo.delete(b);
	}
	 public List<Object[]> getPrice() {
         return bookrepo.getPrice();

         }
	 
	public void deleteitem(int pnr) {
		 bookrepo.delete(pnr);
	}
}
