package com.test.track.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.track.model.Demo;
import com.test.track.service.TrackService;

@RestController
@RequestMapping("/demo")
public class TrackController {
	@Autowired
	TrackService trackService;
	
	@GetMapping("/all")
	public List<Demo> getAll() {
		return trackService.getAll();
	}
	
	@GetMapping("/state/{state}")
	public List<Demo> getAllByState(@PathVariable(name="state") String state) {
		return trackService.getAllByState(state);
	}
	
	@GetMapping("/date") 
	public List<Demo> getAllbyDate(@RequestParam(name="date") String date) { 
		 return trackService.getAllByDate(date); 
	}
	 
	@GetMapping("/state/{statename}/date") 
	public List<Demo> getAllbyStateDate(@PathVariable(name="statename") String stateName, @RequestParam(name="date") String date) { 
		return trackService.getAllByStateNameDate(stateName, date); 
	}
	
}
