package pack1;
class Q
{
	private Q()
	{
		System.out.println("Q()");
	}
}
class R extends Q
{
	R()
	{
		super();
	}
	public static void main(String[]args)
	{
		System.out.println("done");
	}
}
