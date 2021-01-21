class A 
{
	static int i;
	static  
	{
		System.out.println("A.SIB");
	}
}
class V
{
	static
	{
		System.out.println("V.SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(A.i);
		System.out.println("main end");
	}
}
