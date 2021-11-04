package com.test.track.model;

import java.util.List;

public class Details {
	private String todayconfirmed;
	private String activecase;
	private String recovered;
	private String todayrecovered;
	private String deceased;
	private String todaydeceased;
	private String tested;
	private String todaytested;
	private String vaccinated;
	private String todayvaccinated;
	private String dosge1;
	private String todaydosge1;
	private String dosge2;
	private String todaydosge2;
	private List<District> district;
	public Details() {
		super();
	}
	public Details(String todayconfirmed, String activecase, String recovered, String todayrecovered,
			String deceased, String todaydeceased, String tested, String todaytested, String vaccinated,
			String todayvaccinated, String dosge1, String todaydosge1, String dosge2, String todaydosge2,
			List<District> district) {
		super();
		this.todayconfirmed = todayconfirmed;
		this.activecase = activecase;
		this.recovered = recovered;
		this.todayrecovered = todayrecovered;
		this.deceased = deceased;
		this.todaydeceased = todaydeceased;
		this.tested = tested;
		this.todaytested = todaytested;
		this.vaccinated = vaccinated;
		this.todayvaccinated = todayvaccinated;
		this.dosge1 = dosge1;
		this.todaydosge1 = todaydosge1;
		this.dosge2 = dosge2;
		this.todaydosge2 = todaydosge2;
		this.district = district;
	}
	public String getTodayconfirmed() {
		return todayconfirmed;
	}
	public void setTodayconfirmed(String todayconfirmed) {
		this.todayconfirmed = todayconfirmed;
	}
	public String getActivecase() {
		return activecase;
	}
	public void setActivecase(String activecase) {
		this.activecase = activecase;
	}
	public String getRecovered() {
		return recovered;
	}
	public void setRecovered(String recovered) {
		this.recovered = recovered;
	}
	public String getTodayrecovered() {
		return todayrecovered;
	}
	public void setTodayrecovered(String todayrecovered) {
		this.todayrecovered = todayrecovered;
	}
	public String getDeceased() {
		return deceased;
	}
	public void setDeceased(String deceased) {
		this.deceased = deceased;
	}
	public String getTodaydeceased() {
		return todaydeceased;
	}
	public void setTodaydeceased(String todaydeceased) {
		this.todaydeceased = todaydeceased;
	}
	public String getTested() {
		return tested;
	}
	public void setTested(String tested) {
		this.tested = tested;
	}
	public String getTodaytested() {
		return todaytested;
	}
	public void setTodaytested(String todaytested) {
		this.todaytested = todaytested;
	}
	public String getVaccinated() {
		return vaccinated;
	}
	public void setVaccinated(String vaccinated) {
		this.vaccinated = vaccinated;
	}
	public String getTodayvaccinated() {
		return todayvaccinated;
	}
	public void setTodayvaccinated(String todayvaccinated) {
		this.todayvaccinated = todayvaccinated;
	}
	public String getDosge1() {
		return dosge1;
	}
	public void setDosge1(String dosge1) {
		this.dosge1 = dosge1;
	}
	public String getTodaydosge1() {
		return todaydosge1;
	}
	public void setTodaydosge1(String todaydosge1) {
		this.todaydosge1 = todaydosge1;
	}
	public String getDosge2() {
		return dosge2;
	}
	public void setDosge2(String dosge2) {
		this.dosge2 = dosge2;
	}
	public String getTodaydosge2() {
		return todaydosge2;
	}
	public void setTodaydosge2(String todaydosge2) {
		this.todaydosge2 = todaydosge2;
	}
	public List<District> getDistrict() {
		return district;
	}
	public void setDistrict(List<District> district) {
		this.district = district;
	}
	
	
}
