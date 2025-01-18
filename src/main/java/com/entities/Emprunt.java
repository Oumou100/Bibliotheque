package com.entities;

import java.util.Date;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

@Entity
public class Emprunt {
@EmbeddedId
private DetailsCle id;
private int duree;
private Date dateDebut;

@ManyToOne
@MapsId("idAbonne")
private Abonne abonne;

@ManyToOne
@MapsId("idLivre")
private Livre livre;

public Emprunt(DetailsCle id, int duree, Date dateDebut, Abonne abonne, Livre livre) {
	super();
	this.id = id;
	this.duree = duree;
	this.dateDebut = dateDebut;
	this.abonne = abonne;
	this.livre = livre;
}

public Emprunt() {
	super();
}

public DetailsCle getId() {
	return id;
}

public void setId(DetailsCle id) {
	this.id = id;
}

public int getDuree() {
	return duree;
}

public void setDuree(int duree) {
	this.duree = duree;
}

public Date getDateDebut() {
	return dateDebut;
}

public void setDateDebut(Date dateDebut) {
	this.dateDebut = dateDebut;
}

public Abonne getAbonne() {
	return abonne;
}

public void setAbonne(Abonne abonne) {
	this.abonne = abonne;
}

public Livre getLivre() {
	return livre;
}

public void setLivre(Livre livre) {
	this.livre = livre;
}

}
