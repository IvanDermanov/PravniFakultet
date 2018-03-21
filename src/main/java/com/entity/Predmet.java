package com.entity;

/*
 * Entitet predmet treba da sadrži oznaku predmeta,
 * naziv predmeta i broj ESPB bodova.
 * Primer oznake nastavnog predmeta je “08.0001A”.
 * Radi pojednostavljenja uvodim pretpostavku
 * da se jedan ispit moze polagati kod jednog nastavnika
 */
public class Predmet {
	private String oznakaPredmenta;
	private String nazivPredmeta;
	private String jmbgNastavnika;
	private int brojEPS;

	public Predmet(String oznakaPredmenta, String nazivPredmeta, String jmbgNastavnika, int brojEPS) {
		super();
		this.oznakaPredmenta = oznakaPredmenta;
		this.nazivPredmeta = nazivPredmeta;
		this.jmbgNastavnika = jmbgNastavnika;
		this.brojEPS = brojEPS;
	}

}
