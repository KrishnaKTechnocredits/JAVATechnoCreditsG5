package ravi;
import java.util.Scanner;

/*Class created to find a missing number from 1 to given range by user*/
public class FindMisingNumber {

	int[] takeValueFromUser() {     // Method will take the set of numbers as input from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of numbers");
		int size = scan.nextInt();
		int[] numbers = new int[size];
		for (int index = 0; index < numbers.length - 1; index++) {  //loop used to read all the required input from user
			numbers[index] = scan.nextInt();
		}
		return numbers;
	}

	int actualSum(int[] numbers) {           //This Method will add all the numbers provided by user
		int sumActual = numbers[0];
		for (int index = 1; index < numbers.length; index++) {  //loop used to add user input
			sumActual = sumActual + numbers[index];
		}
		return sumActual;
	}

	int expectedSum(int[] numbers) {   //This method will add all the numbers from 1 to user provided array size
		int count = numbers.length;
		int sumExpected = count * (count + 1) / 2;
		return sumExpected;

	}

	void displayMissingValue(int sumExpected, int sumActual) { //Method used to find the missing value from given range
		int missingValue = sumExpected - sumActual;
		System.out.println("Missing value is " + missingValue);
	}

}
