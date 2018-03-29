package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Termini;
import com.interfejs.TerminRepository;

@Service
public class TerminService {
	@Autowired
	private TerminRepository terminRepository;

	public List<Termini> getSviTermini() {
		List<Termini> termin = new ArrayList<>();
		terminRepository.findAll().forEach(termin::add);
		return termin;
	}

	public Optional<Termini> getTerminById(int id) {
		return terminRepository.findById(id);
	}

	public void removeTerminById(int id) {
		terminRepository.deleteById(id);
		;
	}

	public void updateTermin(Termini termin) {
		terminRepository.save(termin);
	}

	public void insertTermin(Termini termin) {
		terminRepository.save(termin);
	}
}
