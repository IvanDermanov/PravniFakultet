package com.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Termin;
import com.model.TerminDao;
@Service
public class TerminService {
	@Autowired
    private TerminDao terminDao;

    public Collection<Termin> getSviTermini(){
        return this.terminDao.getSviTermini();
    }
    
	public Termin getTerminById(int id){
        return this.terminDao.getTerminById(id);
    }
	
    public void removeTerminById(int id) {
        this.terminDao.removeTerminById(id);
    }
    
    public void updateTermin(Termin termin){
        this.terminDao.updateTermin(termin);
    }
    
    public void insertTermin(Termin termin) {
        this.terminDao.insertTerminToDb(termin);
    }
}
