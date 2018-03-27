package com.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.entity.Ispit;
import com.entity.Predmet;
import com.entity.PrijavaIspita;
import com.entity.Termin;



@Repository
public class IspitDao {
	private static Map<String, Ispit> ispiti;

	static {
		ispiti = new HashMap<String, Ispit>() {
			{
				put("08.0001А", new Ispit(new Predmet("08.0001А", "Krivično pravo", 90), new ArrayList<Termin>() {
					{
						add(new Termin(1,"12.02.2018", "12:20"));
						add(new Termin(2,"13.02.2018", "13:00"));
						add(new Termin(3,"14.02.2018", "14:00"));
					}
				}));
				put("02.0001А", new Ispit(new Predmet("02.0001А", "Rimsko pravo", 190), new ArrayList<Termin>() {
					{
						add(new Termin(1,"12.02.2018", "12:20"));
						add(new Termin(2,"13.02.2018", "13:00"));
						add(new Termin(3,"14.02.2018", "14:00"));
					}
				}));
				put("03.0001А", new Ispit(new Predmet("03.0001А", "Građansko pravo", 290), new ArrayList<Termin>() {
					{
						add(new Termin(1,"12.02.2018", "12:20"));
						add(new Termin(2,"13.02.2018", "13:00"));
						add(new Termin(3,"14.02.2018", "14:00"));
					}
				}));
				put("04.0001B", new Ispit(new Predmet("04.0001B", "Ustavno pravo", 390), new ArrayList<Termin>() {
					{
						add(new Termin(1,"12.02.2018", "12:20"));
						add(new Termin(2,"13.02.2018", "13:00"));
						add(new Termin(3,"14.02.2018", "14:00"));
					}
				}));
			}
		};
	}
	public Collection<Ispit> getSviIspiti(){
		return this.ispiti.values();
	}

	public Ispit getIspitBySifraIspita(String id) {
		return this.ispiti.get(id);
	}

	public void removeIspitBySifraIspita(String id) {
		this.ispiti.remove(id);
	}
	
	
	public void updateIspit(Ispit ispit) {
		String id=ispit.getId();
		Ispit i=ispiti.get(id);
		i.setPredmet(ispit.getPredmet());
		i.setTermin(ispit.getTermin());
		ispiti.put(id, ispit);
	}

	public void insertIspitToDb(Ispit ispit) {
		this.ispiti.put(ispit.getId(), ispit);
	}
}
