class G
{
	int i;
}
class M9
{
	public static void main(String[] args) 
	{
		G g1 = new G();
		g1.i = 10;

		G g2 = new G();
		g2.i = 10;

		System.out.println(g1 == g2);//
		System.out.println(g1.equals(g2));//

		G g3 = g1;

		System.out.println(g3 == g1);//
		System.out.println(g3.equals(g1));//
	}
}
