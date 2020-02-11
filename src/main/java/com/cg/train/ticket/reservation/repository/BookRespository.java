package com.cg.train.ticket.reservation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.cg.train.ticket.reservation.model.Book;

public interface BookRespository extends CrudRepository<Book, Integer> {

	@Query(value="select SUM(p.price * p.quantity) from Book p")
	 public  List<Object[]> getPrice();
}
