package com.ghazela.ecommerce.entities;


import javax.persistence.Entity;

@Entity
public class Admin extends User {
	
	private String Tel;

	public String getTel() {
		return Tel;
	}

	public void setTel(String tel) {
		Tel = tel;
	}

	
	
}
