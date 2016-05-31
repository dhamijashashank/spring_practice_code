package com.common.controller;

import java.util.ArrayList;
import java.util.Date;

public class Student {
	
	
	private String studentName;
	private String studentHobby;
	private Long studentMobile;
	private Date studentDOB;
	private ArrayList<String> studentSkill;
	
	
	public Long getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	public ArrayList<String> getStudentSkill() {
		return studentSkill;
	}
	public void setStudentSkill(ArrayList<String> studentSkill) {
		this.studentSkill = studentSkill;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	
	

}
