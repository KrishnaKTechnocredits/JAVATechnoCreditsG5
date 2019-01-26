package manisha;

public class SimpleInterest {
	static void m1(int p, double r, int t) {
		double s = (p * r * t) / 100;
		System.out.println("Simple interest is " + s);
	}

	public static void main(String[] args) {
		m1(1000, 7.5, 6);
	}
}
