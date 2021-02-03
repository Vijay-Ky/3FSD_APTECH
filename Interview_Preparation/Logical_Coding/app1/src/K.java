/* finding out the number of digits available in the given number*/
class K {

	public static void main(String[] args) {
		int num =  123565;
		int count = 0;
		while(num != 0)
		{
			count ++;//
			num = num / 10;//
		}
		System.out.println(count);//
	}
}
