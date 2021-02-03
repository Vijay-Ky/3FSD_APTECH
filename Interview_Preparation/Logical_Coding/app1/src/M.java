/* sum of all the digits in a given number*/
class M {

	public static void main(String[] args) {
		int num = 1234;
		int sum = 0;
		while(num != 0)
		{
			sum = sum + (num % 10);
			num = num / 10;
		}
		System.out.println(sum);//6
	}
}
/*1 st it----
 * num = 12
 * sum = 0 + 3 = 3
 
 - 2nd iteration
 num = 1
 sum = 3 + 2 = 5
 
 - 3rd iteration
 num = 0
 sum = 5 + 1 = 6
 */
