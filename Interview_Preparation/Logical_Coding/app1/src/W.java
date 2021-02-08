/*
 * In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1.
 * */
package app1;

class W {

	public static void main(String[] args) {
		int num1 = 0, num2 = 1, num3, count = 10;
		System.out.println("printing initial two numbers " + num1 + "," + num2);// printing 0 and 1
		for (int i = 1; i <= count; i++)
		{
			num3 = num1 + num2;
			System.out.println(num3  + "  = is the addition of " +" num1 " + num1 + " + "  + " num2 " +  num2 );
			num1 = num2;
			num2 = num3;
			System.out.println("current values after reinitializing " + "num1 = "+ num1 + " and "+ "num2 = " + num2);
		}
	}
}
