package com.practical3;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student
{
	int roll;
	String name;
	
	public void setRoll(int roll) {
		System.out.println("Setting Roll");
		this.roll = roll;
	}
	
	public void setName(String name) {
		System.out.println("Setting Name");
		this.name = name;
	}	

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	
	@PostConstruct
	public void start() throws Exception {
		System.out.println("Inside init() method");
	}

	@PreDestroy
	public void end() throws Exception {
		System.out.println("Inside destroy() method");
	}
}
