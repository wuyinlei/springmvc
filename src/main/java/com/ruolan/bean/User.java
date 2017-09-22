package com.ruolan.bean;


import java.util.Date;

public class User {
	
	private int id;
	private String username;


	private String address;
	private int sex;
	private Date birthday;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getSex() {
		return sex;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getBirthday() {
		return birthday;
	}

	public User(int id, String username, String address) {
		this.id = id;
		this.username = username;
		this.address = address;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", username='" + username + '\'' +
				", address='" + address + '\'' +
				", sex=" + sex +
				", birthday=" + birthday +
				'}';
	}
}
