package ravi;
import java.util.Scanner;

/*Class will take 2 array as input and will perform their sum*/
public class SumOfTwoArray {
	
	int[] takeNumberFromUser() { // Method to take Array as input from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter size of Array");
		int size = scan.nextInt();
		int[] input = new int[size];
		int index=0;
		for (index = 0; index < input.length; index++) {		//taking array element as input on console
			input[index] = scan.nextInt();
		}
		//scan.close();
		return input; // returning input array
	}
	
	int sumOfArrayNumbers(int[] input) {			//Method to calculate sum
		int sum = 0;
		for (int index = 0; index < input.length; index++) {		//loop to get sum of numbers
			sum = sum + input[index];
		}
		return sum;		//returning sum to main method
	}
}
