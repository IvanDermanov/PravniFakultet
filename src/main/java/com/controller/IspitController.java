package com.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Ispit;
import com.service.IspitService;


@RestController
@RequestMapping("/student/ispit")
public class IspitController {
	@Autowired
	private IspitService ispitService;

	// READ
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Ispit> getSviIspiti() {
		return ispitService.getSviIspiti();
	}

	// READ By http://localhost:8080/student/predmet/?id=08.0001А
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Ispit getIspitBySifraIspita(@RequestParam(value = "id") String id) {
		return ispitService.getIspitBySifraIspita(id);
	}

	// DELETE
	@RequestMapping(value = "/", method = RequestMethod.DELETE)
	public void deleteredmetBySifraIspita(@RequestParam(value = "id") String id) {
		ispitService.removeIspitBySifraIspita(id);
	}

	// UPDATE
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void deleteIspitBySifraIspita(@RequestBody Ispit ispit) {
		ispitService.updateIspit(ispit);
	}

	// ADD NEW
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertIspit(@RequestBody Ispit ispit) {
		ispitService.insertIspit(ispit);
	}

}
