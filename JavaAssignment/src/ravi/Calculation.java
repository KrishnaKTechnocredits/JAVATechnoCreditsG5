package ravi;

public class Calculation {
	int result = 0;

	void performAddition(int number1, int number2) {  //This method will perform addition for 2 numbers passed by user
		result = number1 + number2;
		System.out.println("Addition of 2 numbers is : " + result);
	}

	void performSubstraction(int number1, int number2) {  //This method will perform substraction for 2 numbers passed by user
		result = number1 - number2;
		System.out.println("Substraction of 2 numbers is : " + result);
	}

	void performMultiplication(int number1, int number2) {	//This method will perform multiplication for 2 numbers passed by user
		result = number1 * number2;
		System.out.println("Multiplication of 2 numbers is : " + result);
	}

	void performDivision(int number1, int number2) {	//This method will perform division for 2 numbers passed by user
		result = number1 / number2;
		System.out.println("Division of 2 numbers is : " + result);
	}

	void performModular(int number1, int number2) {	//This method will provide reminder for 2 numbers passed by user
		result = number1 % number2;
		System.out.println("Remainder of 2 numbers is : " + result);
	}
}
