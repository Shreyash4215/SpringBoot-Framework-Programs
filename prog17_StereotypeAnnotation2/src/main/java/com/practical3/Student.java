package com.practical3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myObj")
public class Student 
{
	@Value("1")
	int roll;
	@Value("ABCD")
	String name;
	@Value("BMT")
	String add;
	
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
		return "Student [roll=" + roll + ", name=" + name + ", add=" + add + "]";
	}
	
	
}
