package com.lara;
class V
{
	int i,j;
	V(int i, int j)
	{
		this.i=i;
		this.j=j;
	}
	public boolean equals(Object obj)
	{
		V v1=(V) obj;
		boolean flag=(i==v1.i&&j==v1.j);
		return flag;
	}
}
public class Manager22
{
	public static void main(String[] args)
	{
		V v1=new V(20,40);
		V v2=new V(20,40);
		System.out.println(v1.equals(v2));
	}	
}