package com.cg.train.ticket.reservation.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.train.ticket.reservation.model.TrainDetails;

@Repository
public interface TrainDetailsRepository extends CrudRepository<TrainDetails, Integer> {

	
	//TrainDetails findOne(int id);

//	@Query(value="select T.trainno, T.trainname, T.traintime, T.origins, T.destinations,T.endtraintime from TrainDetails T where T.id=T.id")
//	TrainDetails findOne(int id);
	
	//TrainDetails findOne(Long id);
	
}
