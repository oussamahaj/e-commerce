package com.ghazela.ecommerce.entities;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Commande {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_command;
	@OneToMany
	private List <LigneCommande> lignesCommandes;
	public int getId_command() {
		return id_command;
	}
	public void setId_command(int id_command) {
		this.id_command = id_command;
	}
	public List<LigneCommande> getLignesCommandes() {
		return lignesCommandes;
	}
	public void setLignesCommandes(List<LigneCommande> lignesCommandes) {
		this.lignesCommandes = lignesCommandes;
	}
	

	
	
}
