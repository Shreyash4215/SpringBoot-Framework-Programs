package com.practical1;

public class student 
{
	int roll;
	String name,add;
			
	public student(int roll, String name, String add) 
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
