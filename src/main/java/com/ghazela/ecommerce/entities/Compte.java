package com.ghazela.ecommerce.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Compte {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id_compte;
	@OneToOne
	private User user;
	@OneToOne
	private Panier panier;
	
	public int getId_compte() {
		return id_compte;
	}
	public void setId_compte(int id_compte) {
		this.id_compte = id_compte;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Panier getPanier() {
		return panier;
	}
	public void setPanier(Panier panier) {
		this.panier = panier;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
