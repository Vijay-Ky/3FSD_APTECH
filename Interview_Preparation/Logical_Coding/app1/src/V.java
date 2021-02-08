/* to find out whether the given number is a perfect number or not
 * a perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. 
 * 6 = 1 + 2 + 3
 * 28 = 1 + 2 + 4 + 7 + 14
 * sum of all the divisibles except given same number
 */

package app1;

class V {

	public static void main(String[] args) {
		int i = 10;
		int sum = 0;
		for(int j = 1; j <= (i / 2); j++)
		{
			if(i % j == 0)
			{
				sum = sum + j;
			}
		}
		if(i == sum)
		{
			System.out.println(i + " is a perfect number");
		}
		else
		{
			System.out.println(i + " is not a perfect number");
		}
	}
}
