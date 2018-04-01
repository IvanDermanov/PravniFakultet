package com.entity;

import java.io.Serializable;

//CREATE TABLE student(
//		 id VARCHAR(10) NOT NULL,
//		ime VARCHAR(20),
//		prezime VARCHAR(20),
//		studijski_programVARCHAR(3),
//		broj_upisa INT,
//		godina_upisa_fakulteta INT,
//		jmbg VARCHAR(13),
//		datum_rodjenja VARCHAR (10),
//		password VARCHAR (20),
//		semestar INT,
//		PRIMARY KEY (id)
//		);


import javax.persistence.Entity;
import javax.persistence.Id;

/* Entitet student treba da minimalno sadrži 
 * ime, prezime, broj indeksa, JMBG i datum rođenja. 
 * Broj indeksa je tekstualno polje u formatu XXYYY/ZZZZ 
 * 	gde je XXoznaka studijskog programa, 
 * 	YYY redni broj upisanog studenta u godini upisa i 
 * 	ZZZZ je godina kada je student upisao fakultet. 
 * Primer broja indeksa je NB125/2018.
 */
@Entity
public class Student implements Serializable{
	@Id
	private String id;
	private String ime;
	private String prezime;
	private String studijskiProgram;
	private Integer brojUpisa;
	private Integer godinaUpisaFakulteta;
	private String jmbg;
	private String datumRodjenja;
	private String password;
	private int semestar;

	public Student(String id, String ime, String prezime, String studijskiProgram, Integer brojUpisa,
			Integer godinaUpisaFakulteta, String jmbg, String datumRodjenja, String password, Integer semestar) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.studijskiProgram = studijskiProgram;
		this.brojUpisa = brojUpisa;
		this.godinaUpisaFakulteta = godinaUpisaFakulteta;
		this.jmbg = jmbg;
		this.datumRodjenja = datumRodjenja;
		this.password = password;
		this.semestar = semestar;
	}

	public Student() {
		// default constructor
	}

	public String getStudentId(Student student) {
		String id = student.getBrojUpisa().toString() + "/" + student.getGodinaUpisaFakulteta().toString();
		return id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getStudijskiProgram() {
		return studijskiProgram;
	}

	public void setStudijskiProgram(String studijskiProgram) {
		this.studijskiProgram = studijskiProgram;
	}

	public Integer getBrojUpisa() {
		return brojUpisa;
	}

	public void setBrojUpisa(Integer brojUpisa) {
		this.brojUpisa = brojUpisa;
	}

	public Integer getGodinaUpisaFakulteta() {
		return godinaUpisaFakulteta;
	}

	public void setGodinaUpisaFakulteta(Integer godinaUpisaFakulteta) {
		this.godinaUpisaFakulteta = godinaUpisaFakulteta;
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

	public Integer getSemestar() {
		return semestar;
	}

	public void setSemestar(Integer semestar) {
		this.semestar = semestar;
	}

}
