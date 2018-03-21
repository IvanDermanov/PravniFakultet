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

}