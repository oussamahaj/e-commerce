package com.ghazela.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ghazela.ecommerce.Exception.BadRequestException;
import com.ghazela.ecommerce.Exception.RessourceNotFoundException;
import com.ghazela.ecommerce.entities.Produit;
import com.ghazela.ecommerce.repositories.ProduitRepository;
@Service
public class ProduitServiceImpl implements ProduitService {

	@Autowired
	private ProduitRepository produitRepository;
	@Autowired
	private CategorieService categorieService;
	@Override
	public Produit saveProduit(Produit produit) throws RessourceNotFoundException {
		produit.setCategorie(categorieService.getCategorieById(produit.getCategorieId()));
		return produitRepository.save(produit);
	}

	@Override
	public List<Produit> getAllProduit() {
		// TODO Auto-generated method stub
		return produitRepository.findAll();
	}

	@Override
	public Produit getProduitById(Long id) throws RessourceNotFoundException {
		// TODO Auto-generated method stub
		return produitRepository.findById(id).orElseThrow (()->new RessourceNotFoundException("Produit NOT FOUND"));
	}

	@Override
	public String deleteProduitById(Long id) throws RessourceNotFoundException {
		Produit produit=produitRepository.findById(id).orElseThrow (()->new RessourceNotFoundException("Produit NOT FOUND"));
		produitRepository.delete(produit);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit updateProduit(Produit produit) throws BadRequestException {
		// TODO Auto-generated method stub
		if (produit.getId_produit() != null ) {
			return produitRepository.save(produit);
		}else {
			throw new BadRequestException("BAD REQUEST TO UPDATE PRODUIT CAUSED BY INEXIQTANT ID");
		}
	}

	@Override
	public List<Produit> getByProduitEqualsTo() {
		// TODO Auto-generated method stub
		return produitRepository.findByPrix500();
	}



}
