package com.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Livre {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idLivre;
	private String titre;
	private String resume;
	private double prix;
	private String photo;
	
	@ManyToOne
	private Categorie categorie;
	
	@OneToMany(mappedBy = "livre")
	private List<Emprunt>details;

	public Livre(long idLivre, String titre, String resume, double prix, String photo, Categorie categorie,
			List<Emprunt> details) {
		super();
		this.idLivre = idLivre;
		this.titre = titre;
		this.resume = resume;
		this.prix = prix;
		this.photo = photo;
		this.categorie = categorie;
		this.details = details;
	}

	public Livre() {
		super();
	}

	public long getIdLivre() {
		return idLivre;
	}

	public void setIdLivre(long idLivre) {
		this.idLivre = idLivre;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public List<Emprunt> getDetails() {
		return details;
	}

	public void setDetails(List<Emprunt> details) {
		this.details = details;
	}


	
}
