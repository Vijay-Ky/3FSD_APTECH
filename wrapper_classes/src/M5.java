public class M5
{
	public static void main(String [] args)
	{
		String s1 = "10";
		//using second constructor that is accepting- 
		//-string as the argument
		//rule: there should be no alphabets,-
		//-special characters in the string
		//boxing from the content of the string object
		Integer obj = new Integer(s1);//boxing
		int i = obj.intValue();//unboxing
		System.out.println(obj);
		System.out.println(i);
		System.out.println("done");
	}
}
