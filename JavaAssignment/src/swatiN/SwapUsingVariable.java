package swatiN;

public class SwapUsingVariable {

	int temp;

	void swapnumbers(int a, int b) {
		temp = a;
		a = b;
		b = temp;
		System.out.println("Swapped value of a and b are-" + " " + "a :" + a + " and b : " + b);
	}

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		SwapUsingVariable s1 = new SwapUsingVariable();
		s1.swapnumbers(a, b);
	}
}
