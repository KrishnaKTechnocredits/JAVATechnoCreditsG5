package ravi;
import java.util.Scanner;

//This class will take 2 number as input and will provide maximum number using ternary operator
public class FindMaximumUsingTernary {
	int number1, number2;				//instance variable to store numbers

	void takeValueFromUser() {			//Method to take input from user
		System.out.println("Please enter 2 numbers : ");
		Scanner scan = new Scanner(System.in);
		number1 = scan.nextInt();			
		number2 = scan.nextInt();
	}

	void maximumUsingTernary() {		//Method to find maximum number using ternary operator
		int result;
		result = (number1 > number2) ? +number1 : +number2;		//result will capture the bigger number
		System.out.println("Maximum number is " + result);
	}
}
