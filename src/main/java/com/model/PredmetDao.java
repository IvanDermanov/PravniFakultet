package com.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.entity.Predmet;


@Repository
public class PredmetDao {
	private static Map<String, Predmet> predmeti;

	static {

		predmeti = new HashMap<String, Predmet>() {

			{
				put("08.0001А", new Predmet("08.0001А", "Krivično pravo",90));
				put("08.0002А", new Predmet("08.0002А", "Ustavno pravo",80));
				put("08.0003А", new Predmet("08.0003А", "Gradjansko pravo",120));
				put("08.0004А", new Predmet("08.0004А", "Rimsko pravo",250));
			}
		};
	}
	
	public Collection<Predmet> getSviPredmeti() {
		return this.predmeti.values();
	}

	public Predmet getPredmetById(String id) {
		// id je sifra predmeta
		return this.predmeti.get(id);
	}

	public void removePredmetById(String id) {
		this.predmeti.remove(id);
	}
	
	
public void updatePredmet(Predmet predmet) {
		String id=predmet.getOznakaPredmenta();
		Predmet p = predmeti.get(id);
		p.setNazivPredmeta(predmet.getNazivPredmeta());
		p.setBrojEPS(predmet.getBrojEPS());
		
		predmeti.put(id,predmet);
	}

	public void insertPredmetToDb(Predmet predmet) {
		this.predmeti.put(predmet.getOznakaPredmenta(), predmet);
	}
}
