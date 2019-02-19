package ravi;
import java.util.Scanner;

/*This class will identify if a number exist in given array*/
public class CheckIfNumberExist {

	int[] takeValueFromUser() { // Method will take the set of numbers as input from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of numbers ");
		int size = scan.nextInt();
		int[] numbers = new int[size];
		for (int index = 0; index < numbers.length; index++) { // loop used to take value from user
			numbers[index] = scan.nextInt();
		}
		return numbers;
	}

	boolean findIfNumberExist(int[] numbers, int value) { //Method to check if number exist
		boolean flag = false;
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] == value) { //if flag value changes it indicates number exist in array
				flag = true;
				break;
			}
		}
		return flag;
	}

}
