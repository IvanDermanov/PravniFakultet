package com.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Nastavnik;
import com.model.NastavnikDao;


@Service
public class NastavnikService {
	@Autowired
	private NastavnikDao nastavnikDao;

	public Collection<Nastavnik> getSviNastavnici() {
		return this.nastavnikDao.getSviNastavnici();
	}

	public Nastavnik getNastavnikById(String id) {
		return this.nastavnikDao.getNastavnikById(id);
	}

	public void removeNastavnikById(String id) {
		this.nastavnikDao.removeNastavnikById(id);
	}

	public void updateNastavnik(Nastavnik nastavnik) {
		this.nastavnikDao.updateNastavnik(nastavnik);
	}

	public void insertNastavnik(Nastavnik nastavnik) {
		this.nastavnikDao.insertNastavnikToDb(nastavnik);
	}

}
