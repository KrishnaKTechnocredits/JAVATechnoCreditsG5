package ravi;
import java.util.Scanner;

/*Class can be used to check if two given arrays are equal*/
public class ArrayEqualityCheck {

	int[] takeValueFromUserForFirstArray() { // Method will take first set of array as input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of first Array ");
		int size = scan.nextInt();
		int[] numbers = new int[size];
		for (int index = 0; index < numbers.length; index++) { // loop used to take value from console
			numbers[index] = scan.nextInt();
		}
		return numbers;
	}

	int[] takeValueFromUserForSecondArray() { // Method will take the second set of array
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of second Array ");
		int size = scan.nextInt();
		int[] numbers1 = new int[size];
		for (int index = 0; index < numbers1.length; index++) { // loop used to take value from console													
			numbers1[index] = scan.nextInt();
		}
		return numbers1;
	}

	boolean compareArray(int[] numbers, int[] numbers1) {   //this method will compare arrays
		boolean flag = true;
		if (numbers.length != numbers1.length) { //if length not equal array are not equal
			flag = false;
		} else {
			for (int index = 0; index < numbers.length; index++) { //loop to compare array value index wise
				if (numbers[index] != numbers1[index]) {
					flag = false;
				}
			}
		}
		return flag;
	}
}
