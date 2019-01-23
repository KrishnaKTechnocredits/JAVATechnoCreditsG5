package umesh;

class SwapTwoNo {
	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		int temp;
		System.out.println("Enter swap two nos");
		temp = a;// Value of a is assign to temp i.e temp=10
		a = b;// Value of b is assign to a i.e a=20
		b = temp;// Value of temp is assign to b i.e b=10
		System.out.println("Swap value of a is :" + a);
		System.out.println("Swap value of b is :" + b);

	}
}