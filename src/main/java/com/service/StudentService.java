package com.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Student;
import com.interfejs.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Collection<Student> getAllStudents(){
    	List<Student> student=new ArrayList<>();
    	studentRepository.findAll().forEach(student::add);
        return student;
    }
    
	public Optional<Student> getStudentById(String id){
		return studentRepository.findById(id);
    }
	
    public void removeStudentById(String id) {
    	studentRepository.deleteById(id);
    }
    
    public void updateStudent(Student student){
    	studentRepository.save(student);
    }
    
    public void insertStudent(Student student) {
    	studentRepository.save(student);
    }


}
