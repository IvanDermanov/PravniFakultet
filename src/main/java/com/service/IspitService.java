package com.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Ispit;
import com.interfejs.IspitRepository;

@Service
public class IspitService {
	@Autowired
	private IspitRepository ispitRepository;

	public List<Ispit> getSviIspiti() {
		List<Ispit> ispit = new ArrayList<>();
		ispitRepository.findAll().forEach(ispit::add);
		return ispit;
	}


	public void removeIspitBySifraIspita(String id) {
		ispitRepository.deleteById(id);
	}

	public void updateIspit(Ispit ispit) {
		ispitRepository.save(ispit);
	}

	public void insertIspit(Ispit ispit) {
		ispitRepository.save(ispit);
	}


	public List<Ispit> getTerminiPoSifriPredmeta(String sifraPredmeta) {
		List<Ispit> termini= new ArrayList<>();
		for(Ispit isp: ispitRepository.findByPredmet(sifraPredmeta)){
			termini.add(isp);
		}		
		return termini;
	}



}
