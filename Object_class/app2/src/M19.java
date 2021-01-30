class A
{
	int i;
}
class F
{
	int i;
	F(int i)
	{
		this.i = i;
	}
}
class G 
{
	int i;
	G(int i)
	{
		this.i = i;
	}
	public boolean equals(Object obj)
	{
		//if only first operand returns true then only checks second
		return (obj instanceof G && this.i == ((G)obj).i);
		//return this.i == ((G)obj).i;
	}
}
class M19
{
	public static void main(String[] args) 
	{
		G g1 = new G(90);
		F f2 = new F(90);
	
		A a1 = new A();
		a1.i = 90;
	//we suppose to get exception but we get false bcz of instanceof operator
		System.out.println(g1.equals(f2));
	//we suppose to get exception but we get false bcz of instanceof operator
		//System.out.println(g1.equals(a1));
	//we suppose to get exception but we get false bcz of instanceof operator
		//System.out.println(g1.equals(90));
	//we suppose to get exception but we get false bcz of instanceof operator
		//System.out.println(g1.equals(90.0));
	}
}
