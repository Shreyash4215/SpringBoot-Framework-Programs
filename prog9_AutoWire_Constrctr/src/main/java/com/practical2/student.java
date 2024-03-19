package com.practical2;

public class student 
{
	Address add;
			
	public student()
	{
		System.out.println("I am From Def_Con of student");
	}	
		
	public student(Address add)
	{
		this();
		this.add = add;
	}



	void print()
	{
		System.out.println("I am From print of student");
	}
	
	void disp()
	{
		add.print();
		print();
	}
}