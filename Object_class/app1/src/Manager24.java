package com.lara;
class X
{
	int i;
	
}
class Y
{
	int i;
	
}
public class Manager24
{
	public static void main(String[] args)
	{
		X x1=new X();
		x1.i=10;
		Y y1=new Y();
		y1.i=10;
		//System.out.println(x1==y1);
		System.out.println(x1.equals(y1));
		System.out.println(y1.equals(x1));
	}	
}