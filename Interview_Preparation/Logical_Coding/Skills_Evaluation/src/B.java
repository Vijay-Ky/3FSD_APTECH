package test;

import java.util.Scanner;

class B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
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
