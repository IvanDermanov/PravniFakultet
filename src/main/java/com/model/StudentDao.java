package com.model;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.entity.Student;

import java.util.Map;

@Repository
public class StudentDao {

	private static Map<String, Student> studenti;
	static {

		studenti = new HashMap<String, Student>() {

			{
				put("125/2018", new Student("125/2018","Petar", "Petrovic","НБ",125,2018,"1306989361035","13.06.1989","",1));
				put("126/2018", new Student("126/2018","Petar", "Petrovic","О",126,2018,"1306989361035","13.06.1989","",1));
				put("127/2018", new Student("127/2018","Petar", "Petrovic","С",127,2018,"1306989361035","13.06.1989","",1));
				put("128/2018", new Student("128/2018","Petar", "Petrovic","ДЈ",128,2018,"1306989361035","13.06.1989","",1));
				
			}
		};
	}
	
	public Collection<Student> getSviStudenti() {
		return this.studenti.values();
	}

	public Student getStudentById(String id) {
		// id je redni broj upisa / godina upisa 
		return this.studenti.get(id);
	}

	public void removeStudentById(String id) {
		this.studenti.remove(id);
	}
	
	
public void updateStudent(Student student) {
		String id=student.getStudentId(student);
		Student s = studenti.get(id);
		s.setStudijskiProgram(student.getStudijskiProgram());
		s.setDatumRodjenja(student.getDatumRodjenja());
		s.setPrezime(student.getPrezime());
		s.setJmbg(student.getJmbg());
		s.setPassword(student.getPassword());
		
		this.studenti.put(id,student);
	}

	public void insertStudentToDb(Student student) {
		this.studenti.put(student.getStudentId(student), student);
	}


}
