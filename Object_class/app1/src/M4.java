class A
{
	int i;
	public String toString()
	{
		return "its a type object with i value as: " + i;
	}
}
class M4
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.i = 20;
		System.out.println(a1);
	}
}
/*
1. in this case we will be getting
the content of the object rather than the memory address.
2. We usually dont worry about the memory address only the content that matters.
*/
