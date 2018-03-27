package com.entity;

/*
 * Entitet PrijavaIspita treba da sadrži 
 * studenta koji polaze
 * ispit koji polaze
 * odabrani termin u kome student polaze ispit
 * nastavnika kod koga polaze
 * ocenu koju je dobio
 */
public class PrijavaIspita {
	private int id;
	private Student student;
	private Predmet predmet;
	// termin polaganja koji je student odabrao
	private Termin terminPolaganja;
	private Nastavnik nastavnik;
	private int ocena;

	public PrijavaIspita(int id, Student student, Predmet predmet, Termin terminPolaganja, Nastavnik nastavnik,
			int ocena) {
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

	public PrijavaIspita() {
		// default constructor
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Predmet getPredmet() {
		return predmet;
	}

	public void setPredmet(Predmet predmet) {
		this.predmet = predmet;
	}

	public Termin getTerminPolaganja() {
		return terminPolaganja;
	}

	public void setTerminPolaganja(Termin terminPolaganja) {
		this.terminPolaganja = terminPolaganja;
	}

	public Nastavnik getNastavnik() {
		return nastavnik;
	}

	public void setNastavnik(Nastavnik nastavnik) {
		this.nastavnik = nastavnik;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

}
