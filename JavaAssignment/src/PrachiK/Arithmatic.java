package PrachiK;

public class Arithmatic {

	static void addition(int num1, int num2) {
		int add = num1 + num2;
		System.out.println("The Addition is: " + add);
	}

	static void substraction(int num1, int num2) {
		int sub = num1 - num2;
		System.out.println("The Substraction is: " + sub);
	}

	static void multiplication(int num1, int num2) {
		int mul = num1 * num2;
		System.out.println("The Multiplication is: " + mul);
	}

	static void division(int num1, int num2) {
		int div = num1 / num2;
		System.out.println("The Division is: " + div);
	}

	static void remainder(int x, int y) {
		int mode = x % y;
		System.out.println("The Remainder is: " + mode);
	}

	public static void main(String[] args) {
		int num1, num2;
		num1 = Integer.parseInt(args[0]);
		num2 = Integer.parseInt(args[1]);
		addition(num1, num2);
		substraction(num1, num2);
		multiplication(num1, num2);
		division(num1, num2);
		remainder(num1, num2);

	}

}
