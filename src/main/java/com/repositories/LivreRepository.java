package com.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.entities.Categorie;
import com.entities.Livre;

public interface LivreRepository extends JpaRepository<Livre,Long>{

	public List<Livre> findAllByCategorie(@Param("categorie") Categorie categorie);
	
/*	@Query("select l,c from Livre l, Categorie c where l.categorie.idCategorie=livre.idLivre AND livre.nom. like %:motcle%")
	public List<Livre> rechercherParMotCle(@Param("motcle") String motcle);*/

}
