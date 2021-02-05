import java.lang.reflect.Field;
import java.lang.reflect.Method;
class A 
{
	int i;
	void test1()
	{
		System.out.println("from test");
	}
}
class M9
{
	public static void main(String[] args) throws Exception
	{
		Class c1 = Class.forName("A");
		Object obj = c1.newInstance();
		Field f1 = c1.getDeclaredField("i");
		f1.setInt(obj, 20);
		Method m1 = c1.getDeclaredMethod("test1");
		m1.invoke(obj);
		System.out.println(f1.getInt(obj));
		System.out.println();
	}
}
/*

1. Class c1 = c1.forName("A"); - using class name in the form of string.
2. Assume that we are reading this class name from the file system. and using this class
    through Class.forName. if the class is available run time environment load this class
	into the memory. 
3. whenever this class is loading to the memory object is created, then that object will be
   assigned to c1.
4. while using c1.newInstance, object is created to A class, this is another way of creating an
   object to that class(A).
5. c1 pointing to class object whichever created to A class.
   while A loading to the memory one class object is creating to A class,
   same is assigning to c1. Now c1 is a Class object to class A.
   Now If you call newinstance method you will get object to A,
   that object is assigned to obj. Obj pointing to A object.
   We are not using new operator and we are not using clone method.
   This is the third apporoach to create an object to any specified class.
   1 st – by using new operator straight away.
   2 nd – by using clone method.
   3 rd – by using reflection api newInstance method.
6. LNO: 17 we are finding out field object inside A class for the i.
   Inside a A class every information is there in the c1.
   c1 is a Class object to A. Through c1 we can call
   declared field. Supply name of the field in the form of string.
7. we got the field object which is refering to i, inside a A class.
8. f1.setInt(obj, 20); we need to set i value 20 in the obj pointing object.
   obj pointing object is a A object. f1 refering i. obj refering to A object.
   we wanted to set int value to i which is available in the obj.
9. f1.setInt(obj, 20); is similar to obj.i = 20 | in general we will be using
   reference[.]variable = 20 here, obj pointing to A object. f1 pointing to attribute i.
10. f1.setInt(obj, 20); 20 assigning to i. whatever i available in the obj that i modified to 20.
11. Method m1 = c1.getDeclaredMethod("test1"); in the A class there is a test1 method.
    by using c1 we can refere a test1 method.
12. m1.invoke(obj); on obj test1 method will be calling. obj pointing to A object.
    that A object containing i and test1, m1 refering to the test1()
13. System.out.println(f1.getInt(obj)); it is similar to System.out.println(obj.i);
    f1 refering to i
14. So the Output we get is from test
							20
15. we are using class name, attribute name, method name in the form of a string.
*/
