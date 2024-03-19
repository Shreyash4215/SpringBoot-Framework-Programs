package com.practical2;

public class student 
{
	int roll;
	String name;
	Address add;
	
	public student(int roll, String name) 
	{
		this.roll = roll;
		this.name = name;
	}

	public student(int roll, String name, Address add) 
	{
		this.roll = roll;
		this.name = name;
		this.add = add;
	}

	@Override
	public String toString() {
		return "student [roll=" + roll + ", name=" + name + ", add=" + add + "]";
	}		
}