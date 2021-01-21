class Q
{
Q()
{
this(10, 20, false);
System.out.println("Q()");
}
Q(int i, int j)
{
this();
System.out.println("Q(int, int)");
}
Q(int i, int j, boolean k)
{
System.out.println("Q(int, int, boolean)");
}
public static void main(String[] args)
{
Q q1 = new Q();
System.out.println("-----");
Q q2 = new Q(1,2);
System.out.println("-----");
}
}