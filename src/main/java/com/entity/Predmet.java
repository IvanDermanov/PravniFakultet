package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * Entitet predmet treba da sadrži oznaku predmeta,
 * naziv predmeta i broj ESPB bodova.
 * Primer oznake nastavnog predmeta je “08.0001A”.
 * Radi pojednostavljenja uvodim pretpostavku
 * da se jedan ispit moze polagati kod jednog nastavnika
 */
@Entity
public class Predmet {
	@Id
	private String oznakaPredmenta;
	private String nazivPredmeta;
	private int brojEPS;

	public Predmet(String oznakaPredmenta, String nazivPredmeta, int brojEPS) {
		super();
		this.oznakaPredmenta = oznakaPredmenta;
		this.nazivPredmeta = nazivPredmeta;
		this.brojEPS = brojEPS;
	}

	public Predmet() {
		// default constructor
	}

	public String getOznakaPredmenta() {
		return oznakaPredmenta;
	}

	public void setOznakaPredmenta(String oznakaPredmenta) {
		this.oznakaPredmenta = oznakaPredmenta;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public int getBrojEPS() {
		return brojEPS;
	}

	public void setBrojEPS(int brojEPS) {
		this.brojEPS = brojEPS;
	}

}
