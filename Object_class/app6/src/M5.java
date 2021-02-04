class A
{
	static 
	{
		System.out.println("SIB");
	}
}
class M5 
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		A a1 = new A();
		System.out.println("done");
	}
}
