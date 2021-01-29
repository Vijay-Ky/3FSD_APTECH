package com.lara;
class O
{
	String s1;
}
public class Manager15
{
	public static void main(String[] args)
	{
		O obj1= new O();
		obj1.s1="abc";
		O obj2= new O();
		obj2.s1="abc";
		O obj3=obj2;
		System.out.println(obj1==obj2);
		System.out.println(obj2==obj3);
		System.out.println(obj3==obj1);
	}	
}