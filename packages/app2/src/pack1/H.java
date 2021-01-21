package pack1;
class H 
{
	private int i;
	void set(int k)
	{
		i = k;
	}
	int get()
	{
		return i;
	}
}
class I
{
	public static void main(String[] args) 
	{
		H h1 = new H();
		System.out.println(h1.get());//0
		h1.set(90);
		System.out.println(h1.get());//90
	}
}
