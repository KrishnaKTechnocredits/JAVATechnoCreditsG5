package ravi;
import java.util.Scanner;

/*Class can be used to find duplicate number from an array*/
public class FindDuplicateNumber {

	int[] takeValueFromUser() { // Method will take array as input from user

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of Array ");
		int size = scan.nextInt();
		int[] numbers = new int[size];
		for (int index = 0; index < numbers.length; index++) { // loop used to take value from console
			numbers[index] = scan.nextInt();
		}
		return numbers;
	}

	int checkDuplicatedNumber(int[] numbers) { // Method to find duplicate
												// number
		int duplicateNumber = 0;
		for (int index = 0; index < numbers.length; index++) {
			for (int count = 1; count < numbers.length; count++) { // nested for loop to check numbers index-wise
					if (numbers[index] == numbers[count]) {
					duplicateNumber = numbers[index];
					break;
				}
				break;
			}
		}
		return duplicateNumber;
	}
}
