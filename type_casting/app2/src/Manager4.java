class Manager4
{
	static void test1(A a1)
	{
		System.out.println("test1(A)");
	}
	static void test2(C c1)
	{
		System.out.println("test2(C)");
	}
	static D test3()
	{
		D d1 = new D();
		return d1;//return type is d type
	}
	static B test4()
	{
		return new B();//return type is b type
	}
	public static void main(String[] args)
	{
		test1(new A());
		C c1 = new C();
		test2(c1);
		D d1 = test3();
		B b1 = test4();
		System.out.println("done");
	}
}//homogenous