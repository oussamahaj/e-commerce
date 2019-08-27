package com.ghazela.ecommerce.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class LigneCommande {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id_ligne_command;
	@ManyToOne
	private Commande commande;
	@ManyToOne
	private Produit produit;
	private double qte;
	
	
	
	public int getId_ligne_command() {
		return id_ligne_command;
	}
	public void setId_ligne_command(int id_ligne_command) {
		this.id_ligne_command = id_ligne_command;
	}
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public double getQte() {
		return qte;
	}
	public void setQte(double qte) {
		this.qte = qte;
	}
	
	

}
