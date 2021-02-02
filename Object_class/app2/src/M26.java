class I
{
	int x;//primitive
	String s1;//String type

	public boolean equals(Object obj)
	{
		//in string class already equals method got overrided to check the content
		return (obj instanceof I) && (x == ((I)obj).x) && 
			(s1.equals(((I)obj).s1));
	}
}
class M26 
{
	public static void main(String[] args) 
	{
		I obj1 = new I();
		obj1.x = 10;
		obj1.s1 = "hello";

		I obj2 = new I();
		obj2.x = 10;
		obj2.s1 = "hello";

		//if any one attribute changes returns false
		System.out.println(obj1.equals(obj2));//true

		I obj3 = new I();
		//in this case obj3.x values is 0 obj3.s1 value is null
		//System.out.println(obj3.equals(obj1));//false

		//s1 is null
		I obj4 = new I();
		obj4.x = 10;
		//obj4.s1 is null from a null calling equals method
		  //we get NullPointerException
		System.out.println(obj4.equals(obj1));

	}
}
/*
- initialy checking whether obj is current class type or
not. this.x comparing with argument.x and this.s1 comparing with
argument.s1. inside string class equals method already got
overrided to check the content, so this.s1 is a string and
argument.s1 is also a string. If any attribute is changed we get 
the false.

-while creating an object
to obj3 initialy x value is 0, s1 value null we tried to call
equals method on null, so in this case we will be getting the 
null pointer exception
*/
