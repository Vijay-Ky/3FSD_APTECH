class I 
{
	static int i = 10;
	static void test()
	{
		System.out.println("from test()");
		i = 20;
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin: " + i);
		test();
		System.out.println("main end: " + i);
	}
}
