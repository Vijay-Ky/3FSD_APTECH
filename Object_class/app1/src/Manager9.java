class J
{
	int x;
	public String toString()
	{
		String s1 = super.toString();
		String s2 = "x = " + x;
		return s1 + ", " + s2;
	}
}
public class Manager9
{
	public static void main(String[] args)
	{
		J j1 = new J();
		j1.x = 200;
		System.out.println(j1);
	}	
}