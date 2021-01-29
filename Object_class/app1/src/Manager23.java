package com.lara;
class W
{
	int i,j;
	double k,m;
	W(int i, int j,double k,double m)
	{
		this.i=i;
		this.j=j;
		this.k=k;
		this.m=m;
	}
	public boolean equals(Object obj)
	{
		W w1=(W) obj;
		boolean b1=(i==w1.i&&j==w1.j && k==w1.k&&w1.m==m);
		return b1;
	}
}
public class Manager23
{
	public static void main(String[] args)
	{
		W w1=new W(10,20,30.9,40.8);
		W w2=new W(10,20,30.9,40.8);
		W w3=new W(10,20,30.8,40.8);
		System.out.println(w1.equals(w2));
		System.out.println(w1.equals(w3));
	}	
}