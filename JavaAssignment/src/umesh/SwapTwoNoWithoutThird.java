package umesh;

class SwapTwoNoWithoutThird {
	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		System.out.println("Swap two nos");
		a = a + b;// Value of a is assign as 10+20=30 i.e a=30
		b = a - b;// Value of b is assign as 30-20=10 i.e b=10
		a = a - b;// Value of a is assign as 30-10 i.e a=20
		System.out.println("Swap value of a is :" + a);
		System.out.println("Swap value of b is :" + b);

	}
}