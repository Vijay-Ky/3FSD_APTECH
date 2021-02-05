import java.lang.reflect.Field;
import java.lang.reflect.Method;
class A 
{
	int i;
	void test1()
	{

	}
}
class M9
{
	public static void main(String[] args) throws Exception
	{
		Class c1 = c1.forName("A");
		Object obj = c1.newInstance();
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
