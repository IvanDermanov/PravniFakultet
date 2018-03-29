package com.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.entity.Student;
import com.entity.Termini;

@Repository
public class TerminDao {
	private static Map<Integer, Termini> termini;

	static {

		termini = new HashMap<Integer, Termini>() {

			{
				put(1, new Termini(1, "12.02.2018", "12:20", "08.0001А"));
				put(2, new Termini(1, "13.02.2018", "13:00", "09.0001А"));
				put(3, new Termini(1, "14.02.2018", "14:00", "10.0001А"));

			}
		};
	}

	public Collection<Termini> getSviTermini() {
		return this.termini.values();
	}

	public Termini getTerminById(int id) {
		return this.termini.get(id);
	}

	public void removeTerminById(int id) {
		this.termini.remove(id);
	}

	public void updateTermin(Termini termin) {
		int id = termin.getId();
		Termini t = termini.get(id);
		t.setDatum(termin.getDatum());
		t.setVreme(termin.getVreme());

		this.termini.put(id, termin);
	}

	public void insertTerminToDb(Termini termin) {
		this.termini.put(termin.getId(), termin);
	}

}
