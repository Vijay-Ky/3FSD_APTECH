class M15 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println(1000);
			Class.forName("");//min one Class.forName max any no. of we can keep
			Class.forName("");
			Class.forName("");
		}
		catch (ClassNotFoundException ex)
		{
		}
		System.out.println("done");
	}
}