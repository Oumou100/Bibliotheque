package com.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entities.Abonne;
import com.entities.DetailsCle;
import com.entities.Emprunt;
import com.entities.Livre;
import com.repositories.AbonneRepository;
import com.repositories.EmpruntRepository;
import com.repositories.LivreRepository;

@Controller
public class AbonneController {
	@Autowired
	private AbonneRepository abonRepo;
	@Autowired 
	private EmpruntRepository empRepo;
	@Autowired
	private LivreRepository livRepo;
	
	@GetMapping("/abon/ajout")
	public String ajouterAbonne(Model model) {
		
		Abonne newAbonne=new Abonne();
		model.addAttribute("newAbonne", newAbonne);
		return "formAjoutAbonne";
	}
	
	@PostMapping("/abon/save")
	public String enregistrerAbonne(@ModelAttribute Abonne newAbonne) {
		
		abonRepo.save(newAbonne);
		return "redirect:/";
	}
	
	@GetMapping("/emp/ajout")
	public String ajouterProduit(Model model) {
	    List<Abonne> abonnes = abonRepo.findAll();  // Récupération de la liste de produits
	    List<Livre> livres = livRepo.findAll();  // Récupération de la liste de produits

	    model.addAttribute("abonnes", abonnes);
	    model.addAttribute("livres", livres);  // Ajout de la liste des produits au modèle

	    return "formAbonneLivre";  // Vue pour ajouter un produit à la Abonne
	}
	
	@PostMapping("/abon/saveEmpruntLivre")
	public String sauvegarderEmprunt(@RequestParam long codeLivre,@RequestParam long codeAbonne, @RequestParam java.sql.Date date, @RequestParam int duree) {	
	    Livre livre = livRepo.getById(codeLivre);
	    Abonne abonne = abonRepo.getById(codeAbonne);
	    DetailsCle id = new DetailsCle();
	    id.setIdAbonne(codeAbonne);
	    id.setIdLivre(codeLivre);
	    
	    Emprunt emprunt = new Emprunt(id, duree,date, abonne,livre);
	    empRepo.save(emprunt);  // Sauvegarder la ligne de commande
	    
	    return "/emp/";  // Redirection vers les détails de la commande
	}
	
	@GetMapping("/emp/")
	public String consulterProduitsCategorie(Model model) {

	    List<Emprunt> emprunts = empRepo.findAll();  // Récupération de la liste de produits

	    model.addAttribute("emprunts", emprunts);
	    
	    return "emprunt"; 
	}
	
	@GetMapping("/consult")
	public String consulterAbonne(Model model) {
		List<Abonne> abonnes=abonRepo.findAll();
		model.addAttribute("abonnes", abonnes);
		return "formConsult";
	}
	
	@PostMapping("/consulterAbonne")
	public String afficheProduit(@RequestParam long codeAbonne,Model model) {
		Abonne a=abonRepo.getById(codeAbonne);
		model.addAttribute("a", a);
		return "detailsAbonne";
	}
}
