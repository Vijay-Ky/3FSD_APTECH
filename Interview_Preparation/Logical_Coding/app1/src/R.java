/* To print initial 10 prime numbers */
package app1;

class R {

	public static void main(String[] args) {
		int start = 2;// bcz prime numbers are greater than 1
		int count = 1;
		boolean b1;
		
		while(count <= 10)
		{
			b1 = true;
			for(int j = 2; j <= (start / 2); j++)
			{
				if(start % j == 0)
				{
					System.out.println(start + " is not prime because" + start + " is divisible with " + j);
					b1 = false;
					break;
				}
			}
			if(b1)
			{
				System.out.print(start + ", ");
				count ++;
			}
			start ++;
		}
	}
}
/*
 - 2, 3, 5, 7, 11, 13, 17, 19, 23, 29
 -2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
 */
