public class M8
{
	public static void main(String [] args)
	{
		String s1 = "true";
		String s2 = "false";
		String s3 = "10Z";
		Boolean b1 = new Boolean(s1);
		Boolean b2 = new Boolean(s3);
		//if something is other than true its false
		//compiler considers s3 as false
		Boolean b3 = new Boolean(s3);
		boolean b4 = b1.booleanValue();
		boolean b5 = b2.booleanValue();
		boolean b6 = b3.booleanValue();
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
		System.out.println("done");
	}
}
