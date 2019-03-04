package ravi;
import java.util.Scanner;

public class AverageOfArray {

	int[] takeNumberFromUser() { // Method to take Array as input from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter size of numbers");
		int size = scan.nextInt();
		int[] input = new int[size];
		for (int index = 0; index < input.length; index++) {		//taking array element as input on console
			input[index] = scan.nextInt();
		}
		scan.close();
		return input; // returning input array
	}

	float average(int[] input) {			//Method to calculate average
		float average = 0;
		int sum = 0;
		for (int index = 0; index < input.length; index++) {		//loop to get sum of numbers
			sum = sum + input[index];
		}
		average = (float) sum / (input.length);		//average calculation
		return average;
	}
}
