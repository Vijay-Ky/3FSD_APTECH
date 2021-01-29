package com.lara;
class Person
{
	String name;
	int age;
	public String toString()
	{
		String s1="Address:"+super.toString();
		String s2="State: name="+name+",age"+age;
		return s1+" and "+s2;
	}
}
public class Manager10
{
	public static void main(String[] args)
	{
		Person p1= new Person();
		p1.name="abc";
		p1.age=22;
		System.out.println(p1);
	}	
}