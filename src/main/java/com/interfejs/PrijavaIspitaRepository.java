package com.interfejs;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.entity.PrijavaIspita;

public interface PrijavaIspitaRepository extends CrudRepository<PrijavaIspita, Integer> {
	List<PrijavaIspita> findByStudent(String student );
}
