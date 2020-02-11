package com.cg.train.ticket.reservation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="traindetails")
public class TrainDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int trainno;
	private String trainname;
	private String traintime;
	private String origins;
	private String destinations;
	private String endtraintime;
	private int price;
	
	public TrainDetails() {}


	public TrainDetails(int trainno, String trainname, String traintime, String origins,
			String destinations, String endtraintime, int price) {
		this.trainno = trainno;
		this.trainname = trainname;
		this.traintime = traintime;
		this.origins = origins;
		this.destinations = destinations;
		this.endtraintime = endtraintime;
		this.price=price;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "TrainDetails [id=" + id + ", trainno=" + trainno + ", trainname=" + trainname + ", traintime="
				+ traintime + ", origins=" + origins + ", destinations=" + destinations + ", endtraintime="
				+ endtraintime + ", price=" + price + "]";
	}





}
