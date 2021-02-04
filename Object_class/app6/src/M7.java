class A
{
	static 
	{
		System.out.println("SIB");
	}
}
class M7
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		A a1 = new A();
		Class c1 = Class.forName("A");
		
		System.out.println("done");
	}
}
/*
1. if the class is already loaded it wont load one more time. any class will be loading to the 
   memory only one time
*/