package com.interfejs;

import org.springframework.data.repository.CrudRepository;

import com.entity.Predmet;

public interface PredmetRepository extends CrudRepository<Predmet, String> {

}
