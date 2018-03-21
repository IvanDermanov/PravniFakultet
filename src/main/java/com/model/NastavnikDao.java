package com.model;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.entity.Nastavnik;


@Repository
public class NastavnikDao {
	private static Map<Integer, Nastavnik> nastavnici;

	static {

		nastavnici = new HashMap<Integer, Nastavnik>() {

			{
				put(1, new Nastavnik("Petar", "Petrovic","0121950761035","01.21.1969","123213"));
				put(1, new Nastavnik("Petar", "Petrovic","0121950761035","01.21.1969","123213"));
				put(1, new Nastavnik("Petar", "Petrovic","0121950761035","01.21.1969","123213"));
			}
		};
	}
}
