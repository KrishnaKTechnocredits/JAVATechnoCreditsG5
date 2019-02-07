package ravi;
import java.util.Scanner;

//Calculator program using switch cases
public class CalculatorUsingSwitch {
	int result;

	String takeUserAction() {							//Method to take user operation
		System.out.println("Please select the operation");
		String newLine = System.getProperty("line.separator");
		System.out.println("1. Add " + newLine + "2. Substract" + newLine + "3. Multiply" + newLine + "4. Divide");
		Scanner scan = new Scanner(System.in);
		String choice = scan.next();				//Variable to store choice
		return choice;
	}

	void addition(int number1, int number2) {			//Method to perform addition
		result = number1 + number2;
		System.out.println("Addition of numbers is "+result);
	}

	void substraction(int number1, int number2) {		//Method to perform subtraction
		result = number1 - number2;
		System.out.println("Substraction of numbers is "+result);
	}

	void multiply(int number1, int number2) {			//Method to perform multiplication
		result = number1 * number2;
		System.out.println("Multiplication of numbers is "+result);
	}

	void divide(int number1, int number2) {				//Method to perform division
		result = number1 / number2;
		System.out.println("Division of numbers is "+result);
	}

}
