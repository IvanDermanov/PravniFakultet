package com.entity;

import java.io.Serializable;

//CREATE TABLE prijava_ispita(
//	    id BIGINT NOT NULL,
//		student VARCHAR(10),
//	    predmet VARCHAR(10),
//	    termin BIGINT,
//		nastavnik VARCHAR(13),
//		ocena INT,
//		PRIMARY KEY (id),
//		FOREIGN KEY (student) REFERENCES student(id),
//		FOREIGN KEY (predmet) REFERENCES predmet(oznaka),
//		FOREIGN KEY (nastavnik) REFERENCES nastavnik(jmbg),
//		FOREIGN KEY (termin) REFERENCES termin(id)
//	);
import javax.persistence.Entity;
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
public class PrijavaIspita implements Serializable{
	@Id
	private int id;
	private String student;
	private String predmet;
	// termin polaganja koji je student odabrao
	private int terminPolaganja;
	private String nastavnik;
	private int ocena;

	
	public PrijavaIspita() {
		// default constructor
	}


	

	public PrijavaIspita(int id, String student, String predmet, int terminPolaganja, String nastavnik, int ocena) {
		super();
		this.id = id;
		this.student = student;
		this.predmet = predmet;
		this.terminPolaganja = terminPolaganja;
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




	public int getTerminPolaganja() {
		return terminPolaganja;
	}




	public void setTerminPolaganja(int terminPolaganja) {
		this.terminPolaganja = terminPolaganja;
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
