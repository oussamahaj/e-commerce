package com.ghazela.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ghazela.ecommerce.Exception.RessourceNotFoundException;
import com.ghazela.ecommerce.entities.Categorie;
import com.ghazela.ecommerce.repositories.CategorieRepository;
@Service
public class CategorieServiceImpl implements CategorieService {

	@Autowired
	private CategorieRepository categorieRepository;
	@Override
	public Categorie saveCategorie(Categorie categorie) throws RessourceNotFoundException {
		// TODO Auto-generated method stub
		return categorieRepository.save(categorie);
	}

	@Override
	public List<Categorie> getAllCategorie() {
		// TODO Auto-generated method stub
		return categorieRepository.findAll();
	}

	@Override
	public Categorie getCategorieById(Integer id) throws RessourceNotFoundException {
		// TODO Auto-generated method stub
		return categorieRepository.findById(id).orElseThrow (()->new RessourceNotFoundException("CATEGORIE NOT FOUND"));
	}

	@Override
	public String deleteCategorieById(Integer id) throws RessourceNotFoundException {
		// TODO Auto-generated method stub
		Categorie categorie= categorieRepository.findById(id).orElseThrow (()-> new RessourceNotFoundException("USER NOT FOUND"));
		categorieRepository.delete(categorie);
		return "CATEGORIE DELETED WITH SUCCESS";
	}

}
