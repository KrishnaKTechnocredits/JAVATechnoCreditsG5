package manisha;

public class Square {
	static void m1(int x) 
	{
		int f=x*x*x;
		System.out.println("cube of number is " + f);
	}

	static void m2(int x) {
		int b = x * x;
		System.out.println("Square of number is " + b);
	}

	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);
		m1(i);
		m2(i);
	}
}
