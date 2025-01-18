package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.entities.Categorie;

import jakarta.transaction.Transactional;

public interface CategorieRepository extends JpaRepository<Categorie,Long>{
	
	@Transactional
	@Modifying
	@Query("update Categorie c set c.nomCategorie=:nomCategorie set c.description=:description where c.codeCategorie=:codeCategorie")
	public void mettreAjourCategorie(@Param("codeCategorie") long codeCategorie,@Param("nomCategorie") String nomCategorie,@Param("description") String description);
}
