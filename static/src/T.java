class T
{
	static int i = 10;
	static void test()
	{
		int i = 20;
		System.out.println("test1:" + i);
		System.out.println("test2:" + i);
	}
	public static void main(String[] args)
	{
		System.out.println("main1:" + i);
		test();
		System.out.println("main2:" + i);
	}
}