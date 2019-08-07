package com.example.service;

import org.springframework.data.repository.CrudRepository;
import com.example.model.StudentGraduation;
public interface StudentService  extends CrudRepository<StudentGraduation, Integer> {

	static StudentGraduation save(String name, String email, int phone) {
		// TODO Auto-generated method stub
		return null;
	}
	 static String findByName(String name,String email,String major) {
		// TODO Auto-generated method stub
		return "You Search about:  "+name+"  MALE: "+email+"   MAJOR:  "+major;
	}

//	Student findOne(long id);

}
