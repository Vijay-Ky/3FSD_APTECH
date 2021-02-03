class I {
	public static void main(String[] args) {
		int num = 47;
		int num1 = num % 10;//return 7
		num = num / 10;//num is reinitialized, removing right most one digit 7 and 4 is assigned to num
		int num2 = num % 10;//4
		System.out.println(num1);//7
		System.out.println(num2);//4
	}
}
