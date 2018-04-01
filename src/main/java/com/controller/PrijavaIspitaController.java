package com.controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.PrijavaIspita;
import com.service.PrijavaIspitaService;

@RestController
@RequestMapping("/student/prijava_ispita")
public class PrijavaIspitaController {
	@Autowired
	private PrijavaIspitaService prijavaIspitaService;

	// READ
	@RequestMapping(method = RequestMethod.GET)
	public Collection<PrijavaIspita> getSvePrijaveIspita() {
		return prijavaIspitaService.getSvePrijaveIspita();
	}

	// READ By http://localhost:8080/student/prijava_ispita/?id=1
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Optional<PrijavaIspita> getPrijavaIspitaById(@RequestParam(value = "id") int id) {
		return prijavaIspitaService.getPrijavaIspitaById(id);
	}
	// READ By http://localhost:8080/student/prijava_ispita/studenta/?sid=12\2017
	@RequestMapping(value = "/studenta/", method = RequestMethod.GET)
	public List<PrijavaIspita> svePrijaveStudenta(@RequestParam(value = "sid") String student) {
		return prijavaIspitaService.prijaveIspitaStudenta(student);
	}

	// DELETE
	@RequestMapping(value = "/", method = RequestMethod.DELETE)
	public void deletePrijavaIspitaById(@RequestParam(value = "id") int id) {
		prijavaIspitaService.removePrijavaIspitaById(id);
	}

	// UPDATE
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void deleteprijavaIspitaById(@RequestBody PrijavaIspita prijavaIspita) {
		prijavaIspitaService.updatePrijavaIspita(prijavaIspita);
	}

	// ADD NEW
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertprijavaIspita(@RequestBody PrijavaIspita prijavaIspita) {
		prijavaIspitaService.ukolniPrethodnuPrijavuAkoPostoji(prijavaIspita); 
		prijavaIspitaService.insertPrijavaIspita(prijavaIspita);
		
	}
}
