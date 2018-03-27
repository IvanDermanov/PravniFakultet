package com.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.StudentDao;
import com.entity.Student;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudents(){
        return this.studentDao.getSviStudenti();
    }
    
	public Student getStudentById(String id){
        return this.studentDao.getStudentById(id);
    }
	
    public void removeStudentById(String id) {
        this.studentDao.removeStudentById(id);
    }
    
    public void updateStudent(Student student){
        this.studentDao.updateStudent(student);
    }
    
    public void insertStudent(Student student) {
        this.studentDao.insertStudentToDb(student);
    }


}
