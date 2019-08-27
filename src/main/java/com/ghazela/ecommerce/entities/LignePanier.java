package com.ghazela.ecommerce.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class LignePanier {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id_lignePanier;
	private int qte;
	private String etat;
	@ManyToOne
	private Panier panier;
	@ManyToOne
	private Produit produit;
	
	
	
	public int getId_lignePanier() {
		return id_lignePanier;
	}
	public void setId_lignePanier(int id_lignePanier) {
		this.id_lignePanier = id_lignePanier;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Panier getPanier() {
		return panier;
	}
	public void setPanier(Panier panier) {
		this.panier = panier;
	}
	
	
	
	
	
	

}
