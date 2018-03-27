package com.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Predmet;
import com.service.PredmetService;


@RestController
@RequestMapping("/student/predmet")
public class PredmetController {
	@Autowired
	private PredmetService predmetService;

	// READ
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Predmet> getSviPredmeti() {
		return predmetService.getSviPredmeti();
	}

	// READ By http://localhost:8080/student/predmet/?id=08.0001А
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Predmet getPredmetById(@RequestParam(value = "id") String id) {
		return predmetService.getPredmetById(id);
	}

	// DELETE
	@RequestMapping(value = "/", method = RequestMethod.DELETE)
	public void deletePredmetById(@RequestParam(value = "id") String id) {
		predmetService.removePredmetById(id);
	}

	// UPDATE
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void deletePredmetById(@RequestBody Predmet predmet) {
		predmetService.updatePredmet(predmet);
	}

	// ADD NEW
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertPredmet(@RequestBody Predmet predmet) {
		predmetService.insertPredmet(predmet);
	}

}
