package com.model;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.entity.Student;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {

	private static Map<Integer, Student> studenti;

	static {

		studenti = new HashMap<Integer, Student>() {

			{
				put(1, new Student("Petar", "Petrovic","NB125/2018","1306989361035","13.06.1989",""));
				put(2, new Student("Petar", "Petrovic","NB125/2018","1306989361035","13.06.1989",""));
				put(3, new Student("Petar", "Petrovic","NB125/2018","1306989361035","13.06.1989",""));
				put(4, new Student("Petar", "Petrovic","NB125/2018","1306989361035","13.06.1989",""));
			}
		};
	}

}
