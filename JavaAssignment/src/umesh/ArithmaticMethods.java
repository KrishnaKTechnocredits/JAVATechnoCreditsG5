package umesh;
public class ArithmaticMethods {

	void sum(int a, int b) {
		int add = a + b;
		System.out.println("The Sum of two no is: " + add);
	}

	void minus(int a, int b) {
		int sub = a - b;
		System.out.println("The Substraction of two no is: " + sub);
	}

	void multiplication(int a, int b) {
		int mul = a * b;
		System.out.println("The Multiplication of two no is: " + mul);
	}

	void division(int a, int b) {
		int div = a / b;
		System.out.println("The Division of two no is: " + div);
	}

	void remainder(int a, int b) {
		int mode = a % b;
		System.out.println("The Remainder of two no is: " + mode);
	}

	public static void main(String[] args) {
		int a, b;
		ArithmaticMethods ops = new ArithmaticMethods();
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		ops.sum(a, b);
		ops.minus(a, b);
		ops.multiplication(a, b);
		ops.division(a, b);
		ops.remainder(a, b);

	}

}
