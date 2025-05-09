package com.blc.clc.task;

public class Student {
	private String Name;
	private int rollNo;
	private double percentage;

	public void setStudentDetails(String nm , int rn , double per)
	{
		Name = nm;
		rollNo = rn;
		percentage = per;
	}
	public String getStudentDetails()
	{
		return "Student Name : " + Name + "\nRoll No : " + rollNo + "\nPercentage : " + percentage;
	}
}
