/* To find out the multiples of a number in between two given numbers */
package app1;

class N {

	public static void main(String[] args) {
		int num1 = 31;
		int num2 = 65;
	
		int i;
		for(i = num1; i <= num2; i++)
		{
			if(i % 2 == 0)// whichever the number is divisible by 5
			{
				System.out.println(i);
			}
		}
		System.out.println(i);//66
	}
}
