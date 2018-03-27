package com.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Termin;
import com.service.TerminService;


@RestController
@RequestMapping("/student/termin")
public class TerminController {
	@Autowired
    private TerminService terminService;
//READ
    @RequestMapping(method = RequestMethod.GET)
    public Collection<Termin> getSviTermini(){
        return terminService.getSviTermini();
    }
//READ By http://localhost:8080/student/termin/?id=1 
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Termin getTerminById(@RequestParam(value = "id") int id){
        return terminService.getTerminById(id);
    }
//DELETE	
    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public void deleteTerminById(@RequestParam(value = "id") int id){
        terminService.removeTerminById(id);
    }
//UPDATE
    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deleteTerminById(@RequestBody Termin termin){
        terminService.updateTermin(termin);
    }
//ADD NEW
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertTermin(@RequestBody Termin termin){
        terminService.insertTermin(termin);
    }
}
