package ravi;

public class SwapWithoutVariable {
	void swapNumbers(int number1, int number2) {
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		System.out.println("Post swap order of the numbers will be : "+number1+" "+number2);
	}
}
