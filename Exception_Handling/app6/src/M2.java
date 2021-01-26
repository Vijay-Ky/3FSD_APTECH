class M2
{
	public static void main(String[] args) 
	{
		test();
		
			//test();//this is the called of the test method we should keep try-catch here
		/*try
		{
			Class.forName("");//dont look for try-catch for this statement look for the try-catch while calling test() method.
		}
		catch (ClassNotFoundException ex)
		{
		}*/

	
		System.out.println("done");
	}
	static void test() 
	{
		//Class.forName("");
		
		try
		{
			Class.forName("");//dont look for try-catch for this statement look for the try-catch while calling test() method.
		}
		catch (ClassNotFoundException ex)
		{
		}
	}
}
