package com.lara;
class U
{
	double j;
	U(double j)
	{
		this.j=j;
	}
	public boolean equals(Object obj)
	{
		boolean flag=((U)obj).j==this.j;
		return flag;
	}
}
public class Manager21
{
	public static void main(String[] args)
	{
		U u1=new U(90.89);
		U u2=new U(90.89);
		System.out.println(u1.equals(u2));
	}	
}