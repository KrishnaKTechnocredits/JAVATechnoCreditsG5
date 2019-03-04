package ravi;
import java.util.Scanner;

//Class will take number as input and will return it's factorial
public class Factorial{

	int takeNumberFromUser() { // Method to take number as input from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int number = scan.nextInt();
		scan.close();
		return number;
	}

	int factorial(int number) {					//Method to calculate factorial
		int factorial = 1;
		for (int index = 1; index <= number; index++) {		
			factorial = factorial * index;
		}
		return factorial;			//returning factorial value
	}
}
