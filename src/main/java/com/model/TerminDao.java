package com.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.entity.Student;
import com.entity.Termin;

@Repository
public class TerminDao {
	private static Map<Integer, Termin> termini;

	static {

		termini = new HashMap<Integer, Termin>() {

			{
				put(1, new Termin(1,"12.02.2018", "12:20"));
				put(2, new Termin(1,"13.02.2018", "13:00"));
				put(3, new Termin(1,"14.02.2018", "14:00"));

			}
		};
	}

	public Collection<Termin> getSviTermini() {
		return this.termini.values();
	}

	public Termin getTerminById(int id) {
		return this.termini.get(id);
	}

	public void removeTerminById(int id) {
		this.termini.remove(id);
	}
	
	
public void updateTermin(Termin termin) {
		int id=termin.getId();
		Termin t = termini.get(id);
		t.setDatum(termin.getDatum());
		t.setVreme(termin.getVreme());
		
		this.termini.put(id,termin);
	}

	public void insertTerminToDb(Termin termin) {
		this.termini.put(termin.getId(),termin);
	}

}
