package com.entity;

import java.util.List;

/*
 * Entitet ispit treba da sadrži predmet 
 * termine u kojima se može polagati taj predmet
 */
public class Ispit {
	String id;
	private Predmet predmet;
	private List Termin;

	public Ispit(Predmet predmet, List termin) {
		super();
		this.id = predmet.getOznakaPredmenta();
		this.predmet = predmet;
		Termin = termin;
	}

	public Ispit() {
		// default constructor
	}

	public String getId() {
		this.id = predmet.getOznakaPredmenta();
		return predmet.getOznakaPredmenta();
	}

	public void setId(String id) {
		predmet.setOznakaPredmenta(id);
		this.id = id;
	}

	public Predmet getPredmet() {
		return predmet;
	}

	public void setPredmet(Predmet predmet) {
		this.predmet = predmet;
	}

	public List getTermin() {
		return Termin;
	}

	public void setTermin(List termin) {
		Termin = termin;
	}

}
