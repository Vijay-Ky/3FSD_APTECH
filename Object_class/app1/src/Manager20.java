package com.lara;
class T
{
	int i;
	T(int i)
	{
		this.i=i;
	}
	public boolean equals(Object obj)
	{
		T t1=(T)obj;
		return i==t1.i;
	}
}
public class Manager20
{
	public static void main(String[] args)
	{
		T obj1=new T(89);
		T obj2=new T(89);
		System.out.println(obj1.equals(obj2));
	}	
}