package ravi;

import java.util.Scanner;

/*This class can be used to find visible numbers from user provided set of numbers*/
public class FindVisibleTree {

	int[] takeValueFromUser() { // Method will take the set of numbers as input from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of numbers");
		int size = scan.nextInt();
		int[] numbers = new int[size];
		for (int index = 0; index < numbers.length; index++) {
			numbers[index] = scan.nextInt();
		}
		return numbers;
	}

	int findVisibleValues(int[] numbers) { // Method will return the count of visible trees
		int visibleNumber = 0;
		int count = 0;
		for (int index = 0; index < numbers.length; index++) {
			if (visibleNumber < numbers[index]) {
				visibleNumber = numbers[index];
				count++;
			}
		}
		return count;
	}

}
