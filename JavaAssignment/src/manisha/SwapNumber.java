package manisha;

public class SwapNumber {
	
	static void m1(int a, int b) {
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("value of a is " + a + " and value of b is " + b);
	}

	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		m1(i, j);

	}
}

