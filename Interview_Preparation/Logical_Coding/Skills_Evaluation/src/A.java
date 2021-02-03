import java.util.Scanner;
class A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one integer number ");
		int num = sc.nextInt();
		//int num = Integer.parseInt(args[0]);
		if(num % 2 == 0)
		{
			System.out.println("The number " + num + " is even");
		}
		else
		{
			System.out.println("the number " + num + " is odd");
		}
		System.out.println("remainder for " + num + " % 2 " + "is :" + num % 2);
	}
}
