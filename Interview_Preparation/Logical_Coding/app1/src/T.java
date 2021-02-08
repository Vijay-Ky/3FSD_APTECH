package app1;

class T {
	public static void main(String[] args) {
		int start = 50, end = 2;
		boolean b1;
		for(int i = start; i >= end; i--)
		{
			b1 = true;
			for(int j = 2; j <= (i/2); j++)
			{
				if(i % j == 0)
				{
					b1 = false;
					break;
				}
			}
			if(b1)
			{
				System.out.print(i + ", ");
			}
		}
	}
}
