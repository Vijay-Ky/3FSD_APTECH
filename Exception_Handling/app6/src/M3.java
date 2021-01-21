class M3
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		test()
		System.out.println("done");
	}
	static void test() throws ClassNotFoundException
	{
		Class.forName("");//dont look for try-catch for this statement look for the try-catch while calling test() method.
	}
}
/* Throws keyword only for checked exceptions, to avoid including try-catch
if we dont want try-catch we can specify it with throws
*/
