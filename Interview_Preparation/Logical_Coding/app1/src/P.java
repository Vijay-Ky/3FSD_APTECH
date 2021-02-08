class P {

	public static void main(String[] args) {
		int i = 4;
		boolean b1 = true;
		for(int j = 2; j <= (i / 2); j++)
		{
			if( i % j == 0)
			{
				b1 = false;
				break;// we can break the loop
			}
		}
		System.out.println(b1);
	}
}
