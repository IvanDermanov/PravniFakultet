package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Termin;
import com.interfejs.TerminRepository;

@Service
public class TerminService {
	@Autowired
	private TerminRepository terminRepository;

	public List<Termin> getSviTermini() {
		List<Termin> termin = new ArrayList<>();
		terminRepository.findAll().forEach(termin::add);
		return termin;
	}

	public Optional<Termin> getTerminById(int id) {
		return terminRepository.findById(id);
	}

	public void removeTerminById(int id) {
		terminRepository.deleteById(id);
		;
	}

	public void updateTermin(Termin termin) {
		terminRepository.save(termin);
	}

	public void insertTermin(Termin termin) {
		terminRepository.save(termin);
	}
}
