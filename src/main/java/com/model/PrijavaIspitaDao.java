package com.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.entity.Nastavnik;
import com.entity.Predmet;
import com.entity.PrijavaIspita;
import com.entity.Student;
import com.entity.Termin;
@Repository
public class PrijavaIspitaDao {
	private static Map<Integer, PrijavaIspita> prijaveIspita;

	static {

		prijaveIspita = new HashMap<Integer, PrijavaIspita>() {

			{
				put(1, new PrijavaIspita(1,new Student("Petar", "Petrovic","НБ",125,2018,"1306989361035","13.06.1989","",1),new Predmet("08.0001А", "Krivično pravo",90),new Termin(1,"14.02.2018", "14:00"),new Nastavnik("Petar", "Petrovic","0121950761035","01.21.1969","123213"),0));
				put(2, new PrijavaIspita(2,new Student("Petar", "Petrovic","НБ",125,2018,"1306989361035","13.06.1989","",1),new Predmet("08.0001А", "Krivično pravo",90),new Termin(2,"14.02.2018", "14:00"),new Nastavnik("Petar", "Petrovic","0121950761035","01.21.1969","123213"),0));
				put(3, new PrijavaIspita(3,new Student("Petar", "Petrovic","НБ",125,2018,"1306989361035","13.06.1989","",1),new Predmet("08.0001А", "Krivično pravo",90),new Termin(3,"14.02.2018", "14:00"),new Nastavnik("Petar", "Petrovic","0121950761035","01.21.1969","123213"),0));
				
			}
		};
	}
	public Collection<PrijavaIspita> getSvePrijaveIspita(){
		return this.prijaveIspita.values();
	}

	public PrijavaIspita getPrijavaIspitaById(int id) {
		return this.prijaveIspita.get(id);
	}

	public void removePrijavaIspitaById(int id) {
		this.prijaveIspita.remove(id);
	}
	
	
	public void updatePrijavaIspita(PrijavaIspita prijavaIspita) {
		int id=prijavaIspita.getId();
		PrijavaIspita p=prijaveIspita.get(id);
		p.setTerminPolaganja(prijavaIspita.getTerminPolaganja());
		p.setOcena(prijavaIspita.getOcena());
		prijaveIspita.put (id,prijavaIspita);
	}

	public void insertPrijavaIspitaToDb(PrijavaIspita prijava) {
		this.prijaveIspita.put(prijava.getId(), prijava);
	}
}
