package com.ghazela.ecommerce.services;

import java.util.List;

import com.ghazela.ecommerce.Exception.RessourceNotFoundException;
import com.ghazela.ecommerce.entities.Categorie;



public interface CategorieService {

	public Categorie saveCategorie(Categorie categorie) throws RessourceNotFoundException;
	public List<Categorie> getAllCategorie();
	public Categorie getCategorieById(Integer id) throws RessourceNotFoundException;
	public String deleteCategorieById(Integer id)throws RessourceNotFoundException;
}
