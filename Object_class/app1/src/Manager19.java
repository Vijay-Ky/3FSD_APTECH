package com.lara;
class S
{
	double j;
	S(double j)
	{
		this.j=j;
	}
}
public class Manager19
{
	public static void main(String[] args)
	{
		S s1= new S(90.9);
		S s2= new S(90.9);
		S s3=s2;
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s1);
		System.out.println(s1.j==s2.j);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s1));
	}	
}