package com.test.track.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.track.model.Demo;
import com.test.track.repository.TrackRepo;

@Service
public class TrackService {
	@Autowired
	TrackRepo repo;

	public List<Demo> getAll() {
		return repo.findAll();
	}

	public List<Demo> getAllByDate(String date) {
		return repo.findByDate(date);
	}

	public List<Demo> getAllByState(String state) {
		return repo.findByStatename(state);
	}


	public List<Demo> getAllByStateNameDate(String stateName, String date) {
		return repo.findByStateNameDate(stateName, date);
	}

}
