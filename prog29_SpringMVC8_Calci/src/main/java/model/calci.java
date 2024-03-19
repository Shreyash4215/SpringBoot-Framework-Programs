package model;

public class calci 
{
	String txt1,txt2,op;

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

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	@Override
	public String toString() {
		return "calci [txt1=" + txt1 + ", txt2=" + txt2 + ", op=" + op + "]";
	}
	
	public int process()
	{
		int no1 = Integer.parseInt(txt1);
		int no2 = Integer.parseInt(txt2);
		int ans=0;
		
		if("add".equals(op))
			ans=no1+no2;
		else if("sub".equals(op))
			ans=no1-no2;
		else if("mul".equals(op))
			ans=no1*no2;
		else if("div".equals(op))
			ans=no1/no2;
		
		return ans;
	}
}
