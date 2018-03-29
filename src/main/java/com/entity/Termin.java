package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Termin {
	
	@Id
	private int id;
	private String Datum;
	private String Vreme;

	public Termin(int id, String datum, String vreme) {
		super();
		this.id = id;
		this.Datum = datum;
		this.Vreme = vreme;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Termin() {
		// default constructor
	}

	public String getDatum() {
		return Datum;
	}

	public void setDatum(String datum) {
		this.Datum = datum;
	}

	public String getVreme() {
		return Vreme;
	}

	public void setVreme(String vreme) {
		this.Vreme = vreme;
	}
}
