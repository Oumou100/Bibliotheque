package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entities.Categorie;
import com.entities.Livre;
import com.repositories.CategorieRepository;
import com.repositories.LivreRepository;


@Controller
public class LivreController {

	@Autowired
	private LivreRepository livreRepository;
	@Autowired
	private CategorieRepository catRepo;
	
	@GetMapping("/")
	public String listeDesLivres(@RequestParam(defaultValue = "0") Long idCat, Model model) {
	    List<Livre> livres = null;
	    List<Categorie> categories = catRepo.findAll();

	    // Si idCat == 0, afficher tous les livres
	    if (idCat == 0) {
	        livres = livreRepository.findAll();
	    } else {
	        Categorie c = catRepo.findById(idCat).orElse(null);  // On assure que la catégorie existe
	        if (c != null) {
	            livres = livreRepository.findAllByCategorie(c);
	        } else {
	            livres = livreRepository.findAll();  // Si la catégorie n'existe pas, afficher tous les livres
	        }
	    }

	    model.addAttribute("livres", livres);
	    model.addAttribute("categories", categories);
	    return "index";
	}

}
