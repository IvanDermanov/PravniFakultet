package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Predmet;
import com.interfejs.PredmetRepository;

@Service
public class PredmetService {

	@Autowired
	private PredmetRepository predmetRepository;

	public List<Predmet> getSviPredmeti() {
    	List<Predmet> predmet=new ArrayList<>();
    	predmetRepository.findAll().forEach(predmet::add);
        return predmet;
	}

	public Optional<Predmet> getPredmetById(String id) {
		return predmetRepository.findById(id);
	}

	public void removePredmetById(String id) {
		predmetRepository.deleteById(id);
	}

	public void updatePredmet(Predmet predmet) {
		predmetRepository.save(predmet);
	}

	public void insertPredmet(Predmet predmet) {
		predmetRepository.save(predmet);
	}

}
