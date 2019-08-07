package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class StudentGraduation {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int stuno;

    private String stuname;

    private String major;
 
    private String email;
    
	public int getId() {
		return stuno;
	}

	public void setId(int id) {
		stuno = id;
	}

	public String getName() {
		return stuname;
	}

	public void setName(String name) {
		stuname = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String Major) {
		major = Major;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String Email) {
		email = Email;
	}
	}
