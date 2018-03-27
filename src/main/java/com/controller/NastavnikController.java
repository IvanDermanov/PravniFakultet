package com.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.entity.Nastavnik;
import com.service.NastavnikService;

@RestController
@RequestMapping("/student/nastavnik")
public class NastavnikController {
	@Autowired
	private NastavnikService nastavnikService;

	// READ
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Nastavnik> getSviNastavnik() {
		return nastavnikService.getSviNastavnici();
	}

	// READ By http://localhost:8080/student/nastavnik/?id=0121972761028
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Nastavnik getNastavnikById(@RequestParam(value = "id") String id) {
		return nastavnikService.getNastavnikById(id);
	}

	// DELETE
	@RequestMapping(value = "/", method = RequestMethod.DELETE)
	public void deleteNastavnikById(@RequestParam(value = "id") String id) {
		nastavnikService.removeNastavnikById(id);
	}

	// UPDATE
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void deleteNastavnikById(@RequestBody Nastavnik nastavnik) {
		nastavnikService.updateNastavnik(nastavnik);
	}

	// ADD NEW
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertNastavnik(@RequestBody Nastavnik nastavnik) {
		nastavnikService.insertNastavnik(nastavnik);
	}
}
