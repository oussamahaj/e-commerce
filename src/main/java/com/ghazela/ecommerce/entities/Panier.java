package com.ghazela.ecommerce.entities;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Panier {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_panier;
	@OneToOne
	private Compte compte;
	@OneToMany
	private List<LignePanier> Ligne_Paniers;
	public int getId_panier() {
		return id_panier;
	}
	public void setId_panier(int id_panier) {
		this.id_panier = id_panier;
	}
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	public List<LignePanier> getLigne_Paniers() {
		return Ligne_Paniers;
	}
	public void setLigne_Paniers(List<LignePanier> ligne_Paniers) {
		Ligne_Paniers = ligne_Paniers;
	}
	
	

}
