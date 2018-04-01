package com.interfejs;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.entity.Ispit;


public interface IspitRepository extends CrudRepository<Ispit, String> {
	List<Ispit> findByPredmet(String predmet);

}
