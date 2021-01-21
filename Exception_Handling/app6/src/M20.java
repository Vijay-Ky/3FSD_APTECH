class A
{
	A() throws ClassNotFoundException
	{

	}
}
class M20 
{
	public static void main(String[] args) throws ClassNotFoundException //at least caller of the A() should throw this Exception otherwise we get error
	{
		A a1 = new A();
		System.out.println("Hello World!");
	}
}
