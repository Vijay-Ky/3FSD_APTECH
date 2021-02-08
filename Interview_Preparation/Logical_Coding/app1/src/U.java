/* check out whether the given number is a palindrom or not
 * a palindrome is a number that remains same when its digits are reversed
 * 121, 343, 56765, 29892
 * */
package app1;

class U {

	public static void main(String[] args) {
		int num = 5365;
		int i = num;
		int revNum = 0;
		while(i != 0)
		{
			revNum = revNum * 10 + (i % 10);
			i = i / 10;
		}
		if(num == revNum)
		{
			System.out.println("The given number " + num + " is a palindrome");
		}
		else
		{
			System.out.println("The given number " + num + " is not a palindrome");
		}
	}
}
