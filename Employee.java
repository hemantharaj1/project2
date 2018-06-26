package org.greenstech;

public class Employee {
	private int id;
	private String name;
	private Long phone;
	private String email;
	private String password;
	private String cfrmpassword;
	private String cityName;
	
	
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

	public String getCfrmpassword() {
		return cfrmpassword;
	}

	public void setCfrmpassword(String cfrmpassword) {
		this.cfrmpassword = cfrmpassword;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

}
