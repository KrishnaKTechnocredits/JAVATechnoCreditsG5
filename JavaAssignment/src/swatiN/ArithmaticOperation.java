package swatiN;

public class ArithmaticOperation {
	static int sum;
	static int mul;
	static int division;
	static int modulo;
	static int sub;

	static int sum(int a, int b) {
		sum = a + b;
		System.out.println("Result ofsum is" + sum);
		return sum;
	}

	static int sub(int a, int b) {
		sub = a - b;
		System.out.println("Result ofsub is" + sub);
		return sub;
	}

	static int mul(int a, int b) {
		mul = a * b;
		System.out.println("Result of mul is" + mul);
		return mul;
	}

	static int div(int a, int b) {
		division = a / b;
		System.out.println("Result of division is" + division);
		return division;
	}

	static int Modulo(int a, int b) {
		modulo = a % b;
		System.out.println("Result of modulo is" + modulo);
		return modulo;
	}

	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		sum(a, b);
		sub(a, b);
		mul(a, b);
		div(a, b);
		Modulo(a, b);
	}
}
