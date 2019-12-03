package com.training.beans;

public class MyUser {
	private String fname;
	private String lname;
	private String bdate;
	private String gender;
	private String country;
	private String state;
	private String city;
	private String email;
	private String password;
	public MyUser() {
		super();
	}
	public MyUser(String fname, String lname, String bdate, String gender, String country, String state, String city,
			String email, String password) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.bdate = bdate;
		this.gender = gender;
		this.country = country;
		this.state = state;
		this.city = city;
		this.email = email;
		this.password = password;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "MyUser [fname=" + fname + ", lname=" + lname + ", bdate=" + bdate + ", gender=" + gender + ", country="
				+ country + ", state=" + state + ", city=" + city + ", email=" + email + ", password=" + password + "]";
	}
	
	
	

}
