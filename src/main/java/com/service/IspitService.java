package com.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Ispit;
import com.model.IspitDao;

@Service
public class IspitService {
	@Autowired
    private IspitDao ispitDao;

    public Collection<Ispit> getSviIspiti(){
        return this.ispitDao.getSviIspiti();
    }
    
	public Ispit getIspitBySifraIspita(String id){
        return this.ispitDao.getIspitBySifraIspita(id);
    }
	
    public void removeIspitBySifraIspita(String id) {
        this.ispitDao.removeIspitBySifraIspita(id);
    }
    
    public void updateIspit(Ispit ispit){
        this.ispitDao.updateIspit(ispit);
    }
    
    public void insertIspit(Ispit ispit) {
        this.ispitDao.insertIspitToDb(ispit);
    }

}
