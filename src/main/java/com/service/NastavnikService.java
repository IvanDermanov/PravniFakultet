package com.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Nastavnik;
import com.interfejs.NastavnikRepository;



@Service
public class NastavnikService {
	@Autowired
	private NastavnikRepository nastavnikRepository;

	public List<Nastavnik> getSviNastavnici() {
    	List<Nastavnik> nastavnik=new ArrayList<>();
    	nastavnikRepository.findAll().forEach(nastavnik::add);
        return nastavnik;
	}

	public Optional<Nastavnik> getNastavnikById(String id) {
		return nastavnikRepository.findById(id);
	}

	public void removeNastavnikById(String id) {
		nastavnikRepository.deleteById(id);
	}

	public void updateNastavnik(Nastavnik nastavnik) {
		nastavnikRepository.save(nastavnik);
	}

	public void insertNastavnik(Nastavnik nastavnik) {
		nastavnikRepository.save(nastavnik);
	}

}
