class A
{
	int i;

	public String toString()
	{
		return "i value: " + i;
	}
}
class M3
{
	public static void main(String[] args)
	{
		A a1 = new A();
		a1.i = 10;
		A a2 = new A();
		a2.i = 20;
		System.out.println(a1);//address of the object instead of content
		System.out.println(a2);//hexadecimal repr of mem address
	}
}
/*
1.for all the java classes the most commonly required methods are there these methods are defined in a seperate class i,e object class.
2. if the class doesnt extends any other class then it is the direct child class of object class
if the class is already extends another class it is the indirect child class of object class.
3. object class contais totally 11 methods
*/
  