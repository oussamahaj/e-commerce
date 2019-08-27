package com.ghazela.ecommerce.entities;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Produit {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id_produit;
	private String designation;
	private double prix;
	@ManyToOne 
	@JoinColumn (name="id_categorie")
	@JsonBackReference
	private Categorie categorie;
	private String picture_path;
	@OneToMany
	private List<LignePanier> lignepaniers;
	@OneToMany
	private List<LigneCommande> lignecommandes;
	@Transient
	private int categorieId;
	
	public Long getId_produit() {
		return id_produit;
	}
	public void setId_produit(Long id_produit) {
		this.id_produit = id_produit;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public String getPicture_path() {
		return picture_path;
	}
	public void setPicture_path(String picture_path) {
		this.picture_path = picture_path;
	}
	public List<LignePanier> getLignepaniers() {
		return lignepaniers;
	}
	public void setLignepaniers(List<LignePanier> lignepaniers) {
		this.lignepaniers = lignepaniers;
	}
	public List<LigneCommande> getLignecommandes() {
		return lignecommandes;
	}
	public void setLignecommandes(List<LigneCommande> lignecommandes) {
		this.lignecommandes = lignecommandes;
	}
	public int getCategorieId() {
		return categorieId;
	}
	public void setCategorieId(int categorieId) {
		this.categorieId = categorieId;
	}
	
	

}
