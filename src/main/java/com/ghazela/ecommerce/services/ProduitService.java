package com.ghazela.ecommerce.services;

import java.util.List;


import com.ghazela.ecommerce.Exception.BadRequestException;
import com.ghazela.ecommerce.Exception.RessourceNotFoundException;

import com.ghazela.ecommerce.entities.Produit;

public interface ProduitService {

	public Produit saveProduit(Produit produit) throws RessourceNotFoundException;
	public List<Produit> getAllProduit();
	public Produit getProduitById(Long id) throws RessourceNotFoundException;
	public String deleteProduitById(Long id)throws RessourceNotFoundException;
	public Produit updateProduit(Produit produit) throws BadRequestException ;
	
	public List<Produit> getByProduitEqualsTo();
}
