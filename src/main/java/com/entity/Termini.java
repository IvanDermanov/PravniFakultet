package com.entity;

import java.io.Serializable;

//CREATE TABLE termin(
//	    id BIGINT NOT NULL,
//	    datum VARCHAR(10),
//	    vreme VARCHAR(5),
//		predmet VARCHAR(10),
//		PRIMARY KEY (id),
//		FOREIGN KEY (predmet) REFERENCES predmet(oznaka) 
//	);
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Termini implements Serializable{

	@Id
	private int id;
	private String datum;
	private String vreme;
	private String oznakaIspita;
	
	public Termini() {
		
	};
	
	public Termini(int id, String datum, String vreme, String oznakaIspita) {
		super();
		this.id = id;
		this.datum = datum;
		this.vreme = vreme;
		this.oznakaIspita = oznakaIspita;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDatum() {
		return datum;
	}
	public void setDatum(String datum) {
		this.datum = datum;
	}
	public String getVreme() {
		return vreme;
	}
	public void setVreme(String vreme) {
		this.vreme = vreme;
	}
	public String getOznakaIspita() {
		return oznakaIspita;
	}
	public void setOznakaIspita(String oznakaIspita) {
		this.oznakaIspita = oznakaIspita;
	}


}
