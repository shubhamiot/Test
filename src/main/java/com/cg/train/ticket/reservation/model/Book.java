package com.cg.train.ticket.reservation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bookings")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int  pnr;
	private int trainno;
	private String trainname;
	private String traintime;
	private String origins;
	private String destinations;
	private String endtraintime;
	private int quantity;
	private int price;
	
	public Book() {}

	public Book(int trainno, String trainname, String traintime, String origins, String destinations,
			String endtraintime,int quantity, int price) {
		super();
		this.trainno = trainno;
		this.trainname = trainname;
		this.traintime = traintime;
		this.origins = origins;
		this.destinations = destinations;
		this.endtraintime = endtraintime;
		this.quantity=quantity;
		this.price=price;
	}


	public int getPnr() {
		return pnr;
	}


	public void setPnr(int pnr) {
		this.pnr = pnr;
	}


	public int getTrainno() {
		return trainno;
	}


	public void setTrainno(int trainno) {
		this.trainno = trainno;
	}


	public String getTrainname() {
		return trainname;
	}


	public void setTrainname(String trainname) {
		this.trainname = trainname;
	}


	public String getTraintime() {
		return traintime;
	}


	public void setTraintime(String traintime) {
		this.traintime = traintime;
	}


	public String getOrigins() {
		return origins;
	}


	public void setOrigins(String origins) {
		this.origins = origins;
	}


	public String getDestinations() {
		return destinations;
	}


	public void setDestinations(String destinations) {
		this.destinations = destinations;
	}


	public String getEndtraintime() {
		return endtraintime;
	}


	public void setEndtraintime(String endtraintime) {
		this.endtraintime = endtraintime;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [pnr=" + pnr + ", trainno=" + trainno + ", trainname=" + trainname + ", traintime=" + traintime
				+ ", origins=" + origins + ", destinations=" + destinations + ", endtraintime=" + endtraintime
				+ ", quantity=" + quantity + ", price=" + price + "]";
	}

	



	
}
