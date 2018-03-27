package com.entity;

/*
 * Entitet nastavnik treba da sadrži
 * ime, prezime, JMBG i datum rođenja.
 */
public class Nastavnik {
	private String ime;
	private String prezime;
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