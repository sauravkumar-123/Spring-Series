package com.springMVC.Model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class StudentDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String firstname;
	private String lastname;
	private String email;
	private Long mobno;
	
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	private Date dob;
	private String gender;
	//private StudentAddress studentaddress;
	private String city;
	private String state;
	private Long zip;
	private String course;
	  
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobno() {
		return mobno;
	}
	public void setMobno(Long mobno) {
		this.mobno = mobno;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "StudentDetail [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", mobno="
				+ mobno + ", dob=" + dob + ", gender=" + gender + ", city=" + city + ", state=" + state + ", zip=" + zip
				+ ", course=" + course + "]";
	}
	
}
