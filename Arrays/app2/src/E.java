package app2;

public class E {

	public static void main(String[] args) {
		int[] x = new int[10];
		int[] y = new int[20];
		x = y;
		System.out.println(x.length);
		y = x;
		System.out.println(y[19]);
		System.out.println("done");
	}
}
