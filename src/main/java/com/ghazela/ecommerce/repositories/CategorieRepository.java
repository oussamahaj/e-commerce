package com.ghazela.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ghazela.ecommerce.entities.Categorie;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Integer> {

}
