package com.blc.clc.task;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setStudentDetails("Kiran", 24 , 98.9);
		String res = s1.getStudentDetails();
		System.out.println(res);
		

	}

}
