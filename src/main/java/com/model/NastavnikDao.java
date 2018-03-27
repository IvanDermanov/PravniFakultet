package com.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.entity.Nastavnik;


@Repository
public class NastavnikDao {
	private static Map<String, Nastavnik> nastavnici;

	static {

		nastavnici = new HashMap<String, Nastavnik>() {

			{
				put("0121950761035", new Nastavnik("Petar", "Petrovic","0121950761035","01.21.1969","123213"));
				put("0121972761028", new Nastavnik("Petar", "Petrovic","0121950761035","01.21.1969","123213"));
				put("0121981761021", new Nastavnik("Petar", "Petrovic","0121950761035","01.21.1969","123213"));
			}
		};
	}
	public Collection<Nastavnik> getSviNastavnici() {
		return this.nastavnici.values();
	}

	public Nastavnik getNastavnikById(String jmbg) {
		return this.nastavnici.get(jmbg);
	}

	public void removeNastavnikById(String jmbg) {
		this.nastavnici.remove(jmbg);
	}
	
	
public void updateNastavnik(Nastavnik nastavnik) {
		String id=nastavnik.getJmbg();
		Nastavnik n=nastavnici.get(id);
		n.setDatumRodjenja(nastavnik.getDatumRodjenja());
		n.setIme(nastavnik.getIme());
		n.setPrezime(nastavnik.getPrezime());
		n.setPassword(nastavnik.getPassword());
		
		nastavnici.put (id,nastavnik);
		
}
	public void insertNastavnikToDb(Nastavnik nastavnik) {
		this.nastavnici.put(nastavnik.getJmbg(), nastavnik);
	}
}
