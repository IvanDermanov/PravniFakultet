package com.entity;

/*
 * Entitet ispit treba da sadrži 
 * predmet 
 * i termine u kojima se može polagati ispit.
 */
public class Ispit {
	private Predmet predmet;
	private String[] termini = new String[10];

	public Ispit(Predmet predmet, String[] termini) {
		super();
		this.predmet = predmet;
		this.termini = termini;
	}
}
