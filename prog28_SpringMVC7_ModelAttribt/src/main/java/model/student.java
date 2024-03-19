package model;

public class student 
{
	//Controll names must be same which are declared in input.jsp
	String txt1,txt2,txt3;

	public String getTxt1() {
		return txt1;
	}

	public void setTxt1(String txt1) {
		this.txt1 = txt1;
	}

	public String getTxt2() {
		return txt2;
	}

	public void setTxt2(String txt2) {
		this.txt2 = txt2;
	}

	public String getTxt3() {
		return txt3;
	}

	public void setTxt3(String txt3) {
		this.txt3 = txt3;
	}

	@Override
	public String toString() {
		return "student [txt1=" + txt1 + ", txt2=" + txt2 + ", txt3=" + txt3 + "]";
	}
	
}
