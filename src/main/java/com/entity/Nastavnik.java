package com.entity;
import java.io.Serializable;

//CREATE TABLE nastavnik(
//	    jmbg VARCHAR(13) NOT NULL,
//	    ime VARCHAR(20),
//		prezime VARCHAR(20),
//	    datum_rodjenja VARCHAR(10),
//		password VARCHAR (20),
//		PRIMARY KEY (jmbg)
//	);

import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * Entitet nastavnik treba da sadrži
 * ime, prezime, JMBG i datum rođenja.
 */
@Entity
public class Nastavnik implements Serializable{
	private String ime;
	private String prezime;
	@Id
	private String jmbg;
	private String datumRodjenja;
	private String password;

	public Nastavnik(String ime, String prezime, String jmbg, String datumRodjenja, String password) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.datumRodjenja = datumRodjenja;
		this.password = password;
	}

	public Nastavnik() {
		// default constructor
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public String getDatumRodjenja() {
		return datumRodjenja;
	}

	public void setDatumRodjenja(String datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}