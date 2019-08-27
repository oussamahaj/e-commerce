package com.ghazela.ecommerce.webREST;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ghazela.ecommerce.Exception.RessourceNotFoundException;
import com.ghazela.ecommerce.entities.Produit;
import com.ghazela.ecommerce.services.ProduitService;

@RestController
@RequestMapping("/api/produits")
public class ProduitController {
	@Autowired
	private ProduitService produitService;
	@PostMapping
	public ResponseEntity<Produit> createProduit(@RequestBody Produit produit)throws RessourceNotFoundException{
		return new ResponseEntity<Produit>(produitService.saveProduit(produit),HttpStatus.CREATED) ;	
	}
	
	@GetMapping
	
	public ResponseEntity<List<Produit>> getAllProduit(){
		return  new ResponseEntity<List<Produit>>(produitService.getByProduitEqualsTo(),HttpStatus.CREATED);
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Produit> getProduitById(
			@PathVariable(name="id" ) Long id) throws RessourceNotFoundException{
		return new ResponseEntity<Produit>(produitService.getProduitById(id),HttpStatus.OK);	
	}

	@PutMapping
	public ResponseEntity<Produit>updateProduit(@RequestBody Produit produit) throws RessourceNotFoundException {
		return new ResponseEntity<Produit>(produitService.saveProduit(produit), HttpStatus.CREATED);	

	}
}
