package com.practical1;

public class student 
{
	int roll;
	String name,add;
		
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAdd(String add) {
		this.add = add;
	}
		
	@Override
	public String toString() {
		return "student [roll=" + roll + ", name=" + name + ", add=" + add + "]";
	}
	
}
