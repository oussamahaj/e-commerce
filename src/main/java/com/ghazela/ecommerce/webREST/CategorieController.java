package com.ghazela.ecommerce.webREST;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ghazela.ecommerce.Exception.RessourceNotFoundException;
import com.ghazela.ecommerce.entities.Categorie;
import com.ghazela.ecommerce.services.CategorieService;

@RestController
@RequestMapping("/api/categories")
public class CategorieController {
	@Autowired
	private CategorieService categorieService;
	
	@PostMapping
	public ResponseEntity<Categorie> createCategorie(@RequestBody Categorie categorie) throws RessourceNotFoundException{
		return new ResponseEntity<Categorie>(categorieService.saveCategorie(categorie), HttpStatus.CREATED);	
	}	
	
	@GetMapping
	public ResponseEntity<List<Categorie>> getAllCategories(){
		return  new ResponseEntity<List<Categorie>>(categorieService.getAllCategorie(),HttpStatus.CREATED);
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Categorie> getCategorieById(
			@PathVariable(name="id" ) Integer id) throws RessourceNotFoundException{
		return new ResponseEntity<Categorie>(categorieService.getCategorieById(id),HttpStatus.OK);	
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCategorieById(@PathVariable(name="id" ) Integer id)throws RessourceNotFoundException{
		return new ResponseEntity<>(categorieService.deleteCategorieById(id), HttpStatus.OK);
		
	}
	
}
