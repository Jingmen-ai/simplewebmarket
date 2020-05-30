package com.mall.data;

import javax.xml.ws.RequestWrapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class user {
	private int id;
	private String name;
	private String password;
	private Boolean isadmin;
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String isIsadmin() {
		return isadmin.toString();
	}
	public void setIsadmin(Boolean isadmin) {
		this.isadmin = isadmin;
	}
	
}
