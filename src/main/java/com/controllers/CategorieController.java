package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entities.Categorie;
import com.entities.Livre;
import com.repositories.CategorieRepository;
import com.repositories.LivreRepository;

@Controller
public class CategorieController {
	
	/*@Autowired
	private CategorieRepository catRepo;
	
	@Autowired
	private LivreRepository lvRepo;
	
	@GetMapping("/cat/")
	public String afficheListeCategories(Model model) {
		
		List<Categorie> listeCategories=catRepo.findAll();
		model.addAttribute("listeCats", listeCategories);
		return "categories";
	}
	
	@GetMapping("/cat/ajout")
	public String ajouerCategorie(Model model) {
		
		Categorie newCategorie=new Categorie();
		model.addAttribute("newCategorie", newCategorie);
		return "formAjoutCategorie";
	}
	
	@PostMapping("/cat/save")
	public String enregistrerCategorie(@ModelAttribute Categorie newCategorie) {
		
		catRepo.save(newCategorie);
		return "redirect:/cat/";
	}
	
	@GetMapping("/cat/consult")
	public String consulterLivresCategorie(@RequestParam long codeCategorie,Model model) {
		Categorie categorie=catRepo.getById(codeCategorie);
		List<Livre> Livres=categorie.getLivres();
		model.addAttribute("Livres", Livres);
		model.addAttribute("categorie", categorie);
		return "listeLivresParCategorie";
	}
	
	@GetMapping("/cat/edit")
	public String editerCategorie(@RequestParam long codeCategorie, Model model) {
		Categorie categorie=catRepo.getById(codeCategorie);
		model.addAttribute("categorie", categorie);
		return "formEditCat";
	}
	
	@PostMapping("/cat/update")
	public String modifierCategorie(@RequestParam long codeCategorie,@RequestParam String nomCategorie,@RequestParam String description) {
		catRepo.mettreAjourCategorie(codeCategorie,nomCategorie,description);
		return "redirect:/cat/";
	}*/
	
	/*@GetMapping("/cat/delete")
	public String supprimerCategorie(@RequestParam long codeCategorie) {
		int i;
		Categorie categorie=catRepo.getById(codeCategorie);
		List<Livre> Livres=categorie.getLivres();
		for(i=0;i<Livres.size();i++)
			lvRepo.deleteById(Livres.get(i).getIdLivre());
		//lvRepo.deleteAllByCategorie(categorie);
		catRepo.deleteById(codeCategorie);
		return "redirect:/cat/";
	}*/

}
