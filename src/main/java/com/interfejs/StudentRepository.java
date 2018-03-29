package com.interfejs;

import org.springframework.data.repository.CrudRepository;

import com.entity.Student;

public interface StudentRepository extends CrudRepository<Student, String> {

}
