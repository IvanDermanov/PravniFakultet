package com.entity;

/* Entitet Termin je unet radi konzistencije
 * 
 */
public class Termin {
	int id;
	String Datum;
	String Vreme;

	public Termin(int id, String datum, String vreme) {
		super();
		this.id = id;
		Datum = datum;
		Vreme = vreme;
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
		Datum = datum;
	}

	public String getVreme() {
		return Vreme;
	}

	public void setVreme(String vreme) {
		Vreme = vreme;
	}
}
