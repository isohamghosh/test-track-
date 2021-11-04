package com.test.track.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.test.track.model.Demo;

@Repository
public interface TrackRepo extends MongoRepository<Demo, String> {

	List<Demo> findByDate(String date);

	List<Demo> findByStatename(String statename);

	@Query(value = "{ 'date':{$eq: ?1}, 'statename':{$eq: ?0} }")
	List<Demo> findByStateNameDate(String stateName, String date);

}
