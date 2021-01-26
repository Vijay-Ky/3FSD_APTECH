class B
{
	B() throws InterruptedException
	{
	}
}
class C extends B
{
	C() throws InterruptedException
	{
		super();
		
		/*
		try//we cant keep try catch to resolve this prob bcz super must be the first statement
		{
			super();
		}
		catch (InterruptedException ex)
		{
		}
		*/
	}
}
class M21 
{
}
