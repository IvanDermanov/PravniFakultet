package com.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * Entitet ispit treba da sadrži predmet 
 * termine u kojima se može polagati taj predmet
 */

//CREATE TABLE ispit(
//		id BIGINT NOT NULL,
//		student VARCHAR(10),
//		predmet VARCHAR(10),
//		termin BIGINT,
//		nastavnik VARCHAR(13),
//		ocena INT,
//		PRIMARY KEY (id),
//		FOREIGN KEY (student) REFERENCES student(id),
//		FOREIGN KEY (predmet) REFERENCES predmet(oznaka),
//		FOREIGN KEY (termin) REFERENCES termin(id),
//		FOREIGN KEY (nastavnik) REFERENCES nastavnik(jmbg)
//	);
@Entity
public class Ispit implements Serializable{
	@Id
	private int id;
	private String student;
	private String predmet;
	private int termin;
	private String nastavnik;
	private int ocena;

	public Ispit() {
		
	}
	public Ispit(int id, String student, String predmet, int termin, String nastavnik, int ocena) {
		super();
		this.id = id;
		this.student = student;
		this.predmet = predmet;
		this.termin = termin;
		this.nastavnik = nastavnik;
		this.ocena = ocena;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public String getPredmet() {
		return predmet;
	}

	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}

	public int getTermin() {
		return termin;
	}

	public void setTermin(int termin) {
		this.termin = termin;
	}

	public String getNastavnik() {
		return nastavnik;
	}

	public void setNastavnik(String nastavnik) {
		this.nastavnik = nastavnik;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

}
