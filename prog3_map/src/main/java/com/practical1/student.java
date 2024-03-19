package com.practical1;

import java.util.Map;

public class student 
{
	int roll;
	String name,add;
	Map<String,String> crs;
	public student(int roll, String name, String add, Map<String, String> crs) {
		super();
		this.roll = roll;
		this.name = name;
		this.add = add;
		this.crs = crs;
	}
	@Override
	public String toString() {
		return "student [roll=" + roll + ", name=" + name + ", add=" + add + ", crs=" + crs + "]";
	}
		
}
