/* reversing any digit number using while loop*/
class L {

	public static void main(String[] args) {
		int num = 340201;
		int revNum = 0;
		int lastDigit;
		System.out.println(num);
		while(num != 0)
		{
			lastDigit = num % 10;
			revNum = revNum * 10 + lastDigit;
			num = num / 10;
		}
		System.out.println(revNum);
	}
}
/*
1st iteration-------
 num = 34020
 revNum = 1
 lastDigit = 1
 
 2nd iteration---------
 num = 3402
 revNum = 10
 last Digit = 0
 
 3rd Iteration----------
 num = 340
 revNum = 102
 lastDigit = 2
 
 4th Iteration--------
 num = 34
 revNum = 1020
 lastDigit = 0

 5th Iteration--------
 num = 3
 revNum = 10204
 lastDigit = 4

 6th Iteration--------
 num = 0
 revNum = 102043
 lastDigit = 3
 */

