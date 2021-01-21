class I 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		J.test();
		System.out.println("main end");
	}
}
class J
{
	static void test()
	{
		System.out.println("test begin");
		int i = 10 / 0;
		System.out.println("test end");
	}
}