package com.entity;
import java.io.Serializable;

//CREATE TABLE predmet(
//		 oznaka_predmeta  VARCHAR(10) NOT NULL,
//		naziv_predmeta  VARCHAR(20),
//		eps INT,
//			PRIMARY KEY (oznaka_predmeta)
//		);


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * Entitet predmet treba da sadrži oznaku predmeta,
 * naziv predmeta i broj ESPB bodova.
 * Primer oznake nastavnog predmeta je “08.0001A”.
 * Radi pojednostavljenja uvodim pretpostavku
 * da se jedan ispit moze polagati kod jednog nastavnika
 */
@Entity
public class Predmet implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String oznakaPredmeta;
	private String nazivPredmeta;
	private int eps;

	
	public Predmet() {
		// default constructor
	}


	public Predmet( String oznakaPredmeta, String nazivPredmeta, int eps) {
		super();
		this.oznakaPredmeta = oznakaPredmeta;
		this.nazivPredmeta = nazivPredmeta;
		this.eps = eps;
	}




	public String getOznakaPredmeta() {
		return oznakaPredmeta;
	}


	public void setOznakaPredmeta(String oznakaPredmeta) {
		this.oznakaPredmeta = oznakaPredmeta;
	}


	public String getNazivPredmeta() {
		return nazivPredmeta;
	}


	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}


	public int getEps() {
		return eps;
	}


	public void setEps(int Eps) {
		this.eps = Eps;
	}

}
