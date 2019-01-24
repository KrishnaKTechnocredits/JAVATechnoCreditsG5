package manisha;

public class SwapNumber2 {
	static void m1(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Value of a is " + a + " and value of b is " + b);
	}

	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		m1(i, j);
	}

}
