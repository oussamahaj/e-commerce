package com.ghazela.ecommerce.entities;


import javax.persistence.Entity;

@Entity
public class Customer extends User {
	
	
	private String email;
	private String Adresse;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	

}
