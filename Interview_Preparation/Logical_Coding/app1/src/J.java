/* Reverse a given two digit number that is not ending with 0*/
class J {

	public static void main(String[] args) {
		int num = 78;
		System.out.println(num);//78
		int lastDigit = num % 10;//8
		lastDigit = lastDigit * 10;// 8*10=80
		num = num / 10;//7
		num = lastDigit + num;//80 + 7 = 87
		System.out.println(num);//87
	}
}
