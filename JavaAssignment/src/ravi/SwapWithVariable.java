package ravi;

public class SwapWithVariable {
	int temp;

	public void swapNumbers(int number1, int number2) {
		temp = number1;
		number1 = number2;
		number2 = temp;
		System.out.println("Post swap number order will be : " +number1+" " +number2);
	}
}
