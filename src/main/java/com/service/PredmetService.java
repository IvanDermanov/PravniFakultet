package com.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Predmet;
import com.model.PredmetDao;

@Service
public class PredmetService {

	@Autowired
	private PredmetDao predmetDao;

	public Collection<Predmet> getSviPredmeti() {
		return this.predmetDao.getSviPredmeti();
	}

	public Predmet getPredmetById(String id) {
		return this.predmetDao.getPredmetById(id);
	}

	public void removePredmetById(String id) {
		this.predmetDao.removePredmetById(id);
	}

	public void updatePredmet(Predmet predmet) {
		this.predmetDao.updatePredmet(predmet);
	}

	public void insertPredmet(Predmet predmet) {
		this.predmetDao.insertPredmetToDb(predmet);
	}

}
