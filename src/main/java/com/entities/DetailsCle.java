package com.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class DetailsCle {

	private long idAbonne;
	private long idLivre;
	public DetailsCle(long idAbonne, long idLivre) {
		super();
		this.idAbonne = idAbonne;
		this.idLivre = idLivre;
	}
	public DetailsCle() {
		super();
	}
	public long getIdAbonne() {
		return idAbonne;
	}
	public void setIdAbonne(long idAbonne) {
		this.idAbonne = idAbonne;
	}
	public long getIdLivre() {
		return idLivre;
	}
	public void setIdLivre(long idLivre) {
		this.idLivre = idLivre;
	}
	
}
