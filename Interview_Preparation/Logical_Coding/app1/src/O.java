class O {
	public static void main(String[] args) {

		int num1 = 98;
		int num2 = 21;

		int i;
		for ( i = num1; i >= num2; i--) {
			if (i % 7 == 0)// whichever the number is divisible by 7
			{
				System.out.println(i);
			}
		}
		System.out.println(i);
	}
}
