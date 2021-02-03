class C {

	public static void main(String[] args) {
		int num = 97;
		boolean isPrime = true;
		
		for(int j = 2; j <= (num - 1); j++)
		{
			if(num % j == 0)
			{
				isPrime = false;
			}
		}
		System.out.println("Whether the " + num + " is prime or not? " + isPrime);
	}
}
/*
- List of prime number from 1 to 100
2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
*/