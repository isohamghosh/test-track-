package com.test.track.model;

public class District {
	private String districtname;
	private String todayconfirmed;
	private String activecase;
	private String recovered;
	private String todayrecovered;
	private String deceased;
	private String todaydeceased;
	public District() {
		super();
	}
	public District(String districtname, String todayconfirmed, String activecase, String recovered,
			String todayrecovered, String deceased, String todaydeceased) {
		super();
		this.districtname = districtname;
		this.todayconfirmed = todayconfirmed;
		this.activecase = activecase;
		this.recovered = recovered;
		this.todayrecovered = todayrecovered;
		this.deceased = deceased;
		this.todaydeceased = todaydeceased;
	}
	public String getDistrictname() {
		return districtname;
	}
	public void setDistrictname(String districtname) {
		this.districtname = districtname;
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
	
}
