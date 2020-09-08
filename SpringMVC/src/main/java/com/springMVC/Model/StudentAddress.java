package com.springMVC.Model;

public class StudentAddress {

	private String city;
	private String state;
	private Long zip;
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Long getZip() {
		return zip;
	}
	public void setZip(Long zip) {
		this.zip = zip;
	}
	
	
	@Override
	public String toString() {
		return "StudentAddress [city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}
	
	
}

