package com.practical3;

import org.springframework.beans.factory.annotation.Autowired;

public class Student 
{
	private int id;
	private String name;
	private Address address;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	@Autowired
	public Student(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
		System.out.println("Para. Con_or");
	}	
}

