package com.student.manage;

public class Student {
	private int student_id;
	private String student_name;
	private String student_phone;
	private String student_city;
	public Student(int student_id, String student_name, String student_phone, String student_city) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_phone = student_phone;
		this.student_city = student_city;
	}
	public Student() {
		super();
		
	}
	public Student(String student_name, String student_phone, String student_city) {
		super();
		this.student_name = student_name;
		this.student_phone = student_phone;
		this.student_city = student_city;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_phone() {
		return student_phone;
	}
	public void setStudent_phone(String student_phone) {
		this.student_phone = student_phone;
	}
	public String getStudent_city() {
		return student_city;
	}
	public void setStudent_city(String student_city) {
		this.student_city = student_city;
	}
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", student_phone="
				+ student_phone + ", student_city=" + student_city + "]";
	}
	
	
	
	
	
}
