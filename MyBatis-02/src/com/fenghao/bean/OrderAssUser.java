package com.fenghao.bean;

public class OrderAssUser extends Order {

	private Integer id;
	private String username;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "OrderAssUser [id=" + id + ", username=" + username + ", getNumber()=" + getNumber()
				+ ", getCreatetime()=" + getCreatetime() + ", getNote()=" + getNote() + ", getName()=" + getName()
				+ "]";
	}
	
	
	
	
}
