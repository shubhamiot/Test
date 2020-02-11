package com.cg.train.ticket.reservation.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.train.ticket.reservation.model.TrainDetails;
import com.cg.train.ticket.reservation.repository.TrainDetailsRepository;

@Service
@Transactional
public class TrainDetailsService {
	
	
	private final TrainDetailsRepository tdrepository;
	
	public TrainDetailsService(TrainDetailsRepository tdrepository)
	{
		this.tdrepository=tdrepository;
	}
	
	public void save(TrainDetails td)
	{
		tdrepository.save(td);
	}
	
    public List<TrainDetails> listAll() { 
        return (List<TrainDetails>) tdrepository.findAll();
    }
	
    public void deletetrain(int id)
    {
    	tdrepository.delete(id);
    }
    
    public TrainDetails get(int id)
    {
    	 return tdrepository.findOne(id);
    }
}
