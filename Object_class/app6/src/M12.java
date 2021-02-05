import java.lang.reflect.Method;
class A
{
	int test4()
	{
		System.out.println("from test4");
		return 1111;
	}
}
class M12
{
	public static void main(String[] args) throws Exception
	{
		Class c1 = Class.forName("A");
		Object obj = c1.newInstance();	
		Method m4 = c1.getDeclaredMethod("test4");
		Object value = m4.invoke(obj);
		System.out.println(value);
		System.out.println();
	}
}
/*
1. test4 method returning having return type int that is returning int value.
   How to call test4 method through reflectio api??
2. invoke method returning a value, whatever test4 returning a
   value that value returning into object type value. If we wanted
   we can also dowcast into Integer type also. Methods may have a 
   different return type. invoke method is a generic for all the
   methods. That is why return type is object. we can downcast if we
   wanted.
*/
