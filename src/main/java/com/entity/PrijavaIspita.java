package com.entity;

import java.io.Serializable;

//CREATE TABLE prijava_ispita(
//		id SERIAL,
//		student VARCHAR(10),
//		predmet VARCHAR(10),
//		termin INT,
//		ocena INT,
//		PRIMARY KEY (id),
//		FOREIGN KEY (student) REFERENCES student(id),
//		FOREIGN KEY (predmet) REFERENCES predmet(oznaka),
//		FOREIGN KEY (nastavnik) REFERENCES nastavnik(jmbg),
//		FOREIGN KEY (termin) REFERENCES termin(id)
//	);

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * Entitet PrijavaIspita treba da sadrži 
 * studenta koji polaze
 * ispit koji polaze
 * odabrani termin u kome student polaze ispit
 * nastavnika kod koga polaze
 * ocenu koju je dobio
 */
@Entity
public class PrijavaIspita implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
	private String student;
	// termin polaganja koji je student odabrao
	private String danPolaganja;
	private String vremePolaganja;
	private String jmbgProfesora;
	private String sifraPredmeta;
	
	

	public PrijavaIspita() {
		// default constructor
	}



	public PrijavaIspita(int id, String student, String danPolaganja, String vremePolaganja, String jmbgProfesora,
			String sifraPredmeta) {
		super();
		this.id = id;
		this.student = student;
		this.danPolaganja = danPolaganja;
		this.vremePolaganja = vremePolaganja;
		this.jmbgProfesora = jmbgProfesora;
		this.sifraPredmeta = sifraPredmeta;
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



	public String getDanPolaganja() {
		return danPolaganja;
	}



	public void setDanPolaganja(String danPolaganja) {
		this.danPolaganja = danPolaganja;
	}



	public String getVremePolaganja() {
		return vremePolaganja;
	}



	public void setVremePolaganja(String vremePolaganja) {
		this.vremePolaganja = vremePolaganja;
	}



	public String getJmbgProfesora() {
		return jmbgProfesora;
	}



	public void setJmbgProfesora(String jmbgProfesora) {
		this.jmbgProfesora = jmbgProfesora;
	}



	public String getSifraPredmeta() {
		return sifraPredmeta;
	}



	public void setSifraPredmeta(String sifraPredmeta) {
		this.sifraPredmeta = sifraPredmeta;
	}

}
