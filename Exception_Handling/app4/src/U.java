import java.util.Scanner;
public class U
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(Ssystem.in);
		System.out.println("enter something");
		String s1 = sc.next();
		int i = test(s1);
		System.out.println(i);
	}
	
	static int test(String s1)
	{ 
		int i = 0;
		try
		{
			i = Integer.parseInt(s1);
			return i;
		}
	    catch(NumberFormatException ex)
		{	
			return 0;
		}
		finally
		{
			return 1000;
		}
	}
}