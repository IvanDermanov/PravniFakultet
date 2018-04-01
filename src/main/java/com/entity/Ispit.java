package com.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * Entitet ispit treba da sadrži predmet 
 * termine u kojima se može polagati taj predmet
 */


/**
 * 
 * Ispit tabela mapira koji profesor drzi ispit iz kog predmeta u koje vreme
 * vise profesora moze drzati jedan predmet i jedan predmet moze drzati vise
 * profesora
 */
@Entity
public class Ispit implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	long id;
	private String predmet; // sifra predmeta
	private String nastavnik; // jmbg nastavnika
	private String datum;
	private String vreme;

	public Ispit(String predmet, String nastavnik, String datum, String vreme) {
		super();
		this.predmet = predmet;
		this.nastavnik = nastavnik;
		this.datum = datum;
		this.vreme = vreme;
	}

	public Ispit() {
	}


	public String getPredmet() {
		return predmet;
	}

	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}

	public String getNastavnik() {
		return nastavnik;
	}

	public void setNastavnik(String nastavnik) {
		this.nastavnik = nastavnik;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public String getVreme() {
		return vreme;
	}

	public void setVreme(String vreme) {
		this.vreme = vreme;
	}

}
