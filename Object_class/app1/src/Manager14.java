package com.lara;
class N
{
}
public class Manager14
{
	public static void main(String[] args)
	{
		N n1= new N();
		N n2=new N();
		N n3=n1;
		System.out.println(n1==n2);
		System.out.println(n2==n3);
		System.out.println(n3==n1);
	}	
}