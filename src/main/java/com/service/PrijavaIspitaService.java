package com.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.PrijavaIspita;
import com.model.PrijavaIspitaDao;

@Service
public class PrijavaIspitaService {
	@Autowired
    private PrijavaIspitaDao prijavaIspitaDao;

    public Collection<PrijavaIspita> getSvePrijaveIspita(){
        return this.prijavaIspitaDao.getSvePrijaveIspita();
    }
    
	public PrijavaIspita getPrijavaIspitaById(int id){
        return this.prijavaIspitaDao.getPrijavaIspitaById(id);
    }
	
    public void removePrijavaIspitaById(int id) {
        this.prijavaIspitaDao.removePrijavaIspitaById(id);
    }
    
    public void updatePrijavaIspita(PrijavaIspita prijavaIspita){
        this.prijavaIspitaDao.updatePrijavaIspita(prijavaIspita);
    }
    
    public void insertPrijavaIspita(PrijavaIspita prijavaIspita) {
        this.prijavaIspitaDao.insertPrijavaIspitaToDb(prijavaIspita);
    }

}
