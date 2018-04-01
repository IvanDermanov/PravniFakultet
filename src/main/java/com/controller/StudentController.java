package com.controller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Student;
import com.service.StudentService;

@RestController
@RequestMapping("/student/student")
public class StudentController {

    @Autowired
    private StudentService studentService;
//READ
    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
//READ By http://localhost:8080/student/student/?id=125/2018 
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Optional<Student> getStudentById(@RequestParam(value = "id") String id){
        return studentService.getStudentById(id);
    }
//DELETE	
    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public void deleteStudentById(@RequestParam(value = "id") String id){
        studentService.removeStudentById(id);
    }
//UPDATE
    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deleteStudentById(@RequestBody Student student){
        studentService.updateStudent(student);
    }
//ADD NEW
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertStudent(@RequestBody Student student){
        studentService.insertStudent(student);
    }
    
}