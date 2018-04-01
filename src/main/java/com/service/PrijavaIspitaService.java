package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.PrijavaIspita;
import com.interfejs.PrijavaIspitaRepository;

@Service
public class PrijavaIspitaService {
	@Autowired
	private PrijavaIspitaRepository prijavaIspitaRepository;

	public List<PrijavaIspita> getSvePrijaveIspita() {
		List<PrijavaIspita> prijavaIspita = new ArrayList<>();
		prijavaIspitaRepository.findAll().forEach(prijavaIspita::add);
		return prijavaIspita;
	}

	public Optional<PrijavaIspita> getPrijavaIspitaById(int id) {
		return prijavaIspitaRepository.findById(id);
	}

	public void removePrijavaIspitaById(int id) {
		prijavaIspitaRepository.deleteById(id);
	}

	public void updatePrijavaIspita(PrijavaIspita prijavaIspita) {
		prijavaIspitaRepository.save(prijavaIspita);
	}

	public void insertPrijavaIspita(PrijavaIspita prijavaIspita) {
		prijavaIspitaRepository.save(prijavaIspita);
	}

	public List<PrijavaIspita> prijaveIspitaStudenta(String student) {
		List<PrijavaIspita> prijave = new ArrayList<>();
		for (PrijavaIspita pispita : prijavaIspitaRepository.findByStudent(student)) {
			prijave.add(pispita);
		}
		return prijave;
	}

	public void ukolniPrethodnuPrijavuAkoPostoji(PrijavaIspita prijavaIspita) {

		for (PrijavaIspita pispita : prijavaIspitaRepository.findByStudent(prijavaIspita.getStudent())) {
			if (pispita.getSifraPredmeta().contentEquals(prijavaIspita.getSifraPredmeta()))
				prijavaIspitaRepository.deleteById(pispita.getId());
		}
	}

}
