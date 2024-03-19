package com.practical2;

public class student 
{
	Address add;

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public student()
	{
		System.out.println("I am From Def_Con of student");
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