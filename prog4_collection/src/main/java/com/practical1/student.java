 package com.practical1;

import java.util.List;

public class student 
{
	int roll;
	String name,add;
	List<String> mono;
	
	public student(int roll, String name, String add, List<String> mono) {
		super();
		this.roll = roll;
		this.name = name;
		this.add = add;
		this.mono = mono;
	}

	@Override
	public String toString() {
		return "student [roll=" + roll + ", name=" + name + ", add=" + add + ", mono=" + mono + "]";
	}
		
}
