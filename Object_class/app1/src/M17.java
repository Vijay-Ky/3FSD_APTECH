class A extends F
{
	int i;
	A()
	{
		super(90);
	}

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
		F ref = (F) obj;//downcasting obj into F
		return i == ref.i;
	}
}
class M17 
{
	public static void main(String[] args) 
	{
		F f1 = new F(90);
		F f2 = new F(90);
	
		A a1 = new A();
		a1.i = 90;
		System.out.println(f1.equals(f2));
		//we get classcastexception bcz
		  //String,Integer,boolean are not subclass to F so we get Exception
		//CTS bcz equals method arg type is object type
		//class A is also subclass to object type
		//it automaticaly upcast
		System.out.println(f1.equals(a1));
		//can supply string
		//System.out.println(f1.equals("xyz"));
		//can supply any wrapper object
		//90 is boxing into Integer object
		//Integer object is upcasted into Object type
		//System.out.println(f1.equals(90));
		System.out.println(f1.equals(true));
	}
}
