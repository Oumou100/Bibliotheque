package com.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Abonne {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long noAbonne;
	private String nom;
	private String prenom;
	private String email;
	private String tel;
	@OneToMany(mappedBy = "abonne")
	private List<Emprunt>details;
	public Abonne(long noAbonne, String nom, String prenom, String email, String tel, List<Emprunt> details) {
		super();
		this.noAbonne = noAbonne;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.tel = tel;
		this.details = details;
	}
	public Abonne() {
		super();
	}
	public long getNoAbonne() {
		return noAbonne;
	}
	public void setNoAbonne(long noAbonne) {
		this.noAbonne = noAbonne;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public List<Emprunt> getDetails() {
		return details;
	}
	public void setDetails(List<Emprunt> details) {
		this.details = details;
	}
	
	
}
