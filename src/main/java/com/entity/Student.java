package com.entity;
/* Entitet student treba da minimalno sadrži 
 * ime, prezime, broj indeksa, JMBG i datum rođenja. 
 * Broj indeksa je tekstualno polje u formatu XXYYY/ZZZZ 
 * 	gde je XXoznaka studijskog programa, 
 * 	YYY redni broj upisanog studenta u godini upisa i 
 * 	ZZZZ je godina kada je student upisao fakultet. 
 * Primer broja indeksa je NB125/2018.
 */
public class Student {
	private String ime;
	private String prezime;
	private String brojIndeksa;
	private String jmbg;
	private String datumRodjenja;
	private String password;


	
	public Student(String ime, String prezime, String brojIndeksa, String jmbg, String datumRodjenja, String password) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.brojIndeksa = brojIndeksa;
		this.jmbg = jmbg;
		this.datumRodjenja = datumRodjenja;
		this.password = password;
	}

	public Student() {
		//default constructor
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

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
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
