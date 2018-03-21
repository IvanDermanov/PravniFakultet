package com.model;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.entity.Predmet;


@Repository
public class PredmetDao {
	private static Map<Integer, Predmet> predmeti;

	static {

		predmeti = new HashMap<Integer, Predmet>() {

			{
				put(1, new Predmet("Petar", "Petrovic","NB125/2018",90));
				put(2, new Predmet("Petar", "Petrovic","NB125/2018",80));
				put(3, new Predmet("Petar", "Petrovic","NB125/2018",60));
				put(4, new Predmet("Petar", "Petrovic","NB125/2018",89));
			}
		};
	}
}
