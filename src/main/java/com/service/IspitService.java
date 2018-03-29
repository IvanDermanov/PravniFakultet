package com.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Ispit;
import com.entity.Student;
import com.interfejs.IspitRepository;
import com.model.IspitDao;

@Service
public class IspitService {
	@Autowired
	private IspitRepository ispitRepository;

	public List<Ispit> getSviIspiti() {
		List<Ispit> ispit = new ArrayList<>();
		ispitRepository.findAll().forEach(ispit::add);
		return ispit;
	}

	public Optional<Ispit> getIspitBySifraIspita(String id) {
		return ispitRepository.findById(id);

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

}
