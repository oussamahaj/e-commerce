package com.ghazela.ecommerce.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.ghazela.ecommerce.entities.Produit;

@Repository
public interface ProduitRepository extends JpaRepository<Produit,Long> {

	
	@Query("SELECT e FROM Produit e WHERE e.prix = 90")
	public List<Produit> findByPrix500();
	
}
