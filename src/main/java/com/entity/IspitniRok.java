package com.entity;

/*
 * Entitet ispitni rok 
 * treba da sadrži predmet koji je student prijavio 
 * studenta koji polaze ispit 
 * termin polaganja u kome je student prijavio ispit 
 */
public class IspitniRok {
	private Predmet predmet;
	private Student student;
	private String terminPolaganja;

	public IspitniRok(Predmet predmet, Student student, String terminPolaganja) {
		super();
		this.predmet = predmet;
		this.student = student;
		this.terminPolaganja = terminPolaganja;
	}
}
