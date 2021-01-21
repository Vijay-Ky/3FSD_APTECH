class M3
{
	public static void main(String[] args) 
	{
		void test()
		{	
			//clone();//checked type of exception requires try and catch

			try
			{
				clone();
			}
			catch (CloneNotSupportedException ex)
			{
				ex.printStackTrace();
			}
		}
	}
}
