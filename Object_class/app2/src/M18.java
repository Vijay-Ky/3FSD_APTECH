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
	public boolean equals(Object obj)
	{
       //to avoid this we can first get suggestion from instance of operatror
		if(! (obj instanceof F))
		{
			return false;
		}
		F ref = (F) obj;//downcasting obj into F
		return this.i == ref.i;
	}
}
class M18 
{
	public static void main(String[] args) 
	{
		F f1 = new F(90);
		F f2 = new F(90);
	
		A a1 = new A();
		a1.i = 90;
		System.out.println(f1.equals(f2));//true
		System.out.println(f1.equals(a1));//false
		System.out.println(f1.equals("xyz"));//false
		System.out.println(f1.equals(90));//f
		System.out.println(f1.equals(true));//f
	}
}
