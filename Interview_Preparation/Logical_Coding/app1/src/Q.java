public class Q {
	public static void main(String[] args) {
		int i = 4;
		boolean b1 = true;
		for(int j = 2; j <= (i / 2); j++)
		{
			if( i % j == 0)
			{
				b1 = false;
				break;
			}
		}
		if(b1)
		{
			System.out.println("The given number " + i + " is prime");
		}
		else
		{
			System.out.println("The given number " + i + " is not prime");
		}
	}

}
