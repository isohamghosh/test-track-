package com.test.track.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="Demo")
public class Demo {
	@Id
	private String id;
	private String date;
	private String statename;
	private Details details;
	public Demo() {
		super();
	}
	
	public Demo(String date, String staename, Details details) {
		super();
		this.date = date;
		this.statename = staename;
		this.details = details;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Details getDetails() {
		return details;
	}

	public void setDetails(Details details) {
		this.details = details;
	}

	public String getId() {
		return id;
	}
	
}
