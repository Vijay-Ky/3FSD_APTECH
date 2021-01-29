package com.lara;
class Q
{
	boolean flag;
}
public class Manager17
{
	public static void main(String[] args)
	{
		Q q1= new Q();
		q1.flag=true;
		Q q2= new Q();
		q2.flag=true;
		System.out.println(q1==q2);
		System.out.println(q1.flag==q2.flag);
		double d1=10.9,d2=10.9;
		System.out.println(d1==d1);
	}	
}