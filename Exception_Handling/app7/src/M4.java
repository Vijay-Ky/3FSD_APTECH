import java.util.Scanner;
class M4
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		if(age <= 0)
		{
			throw new AgeIsNegativeException("age should be greater than 0");
		}
		System.out.println(2);
	}
}