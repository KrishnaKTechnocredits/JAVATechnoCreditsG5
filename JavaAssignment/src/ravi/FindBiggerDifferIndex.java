package ravi;
import java.util.Scanner;

/*Class will take 2 array as input and will provide differ index and the maximum value*/
public class FindBiggerDifferIndex {

	int[] takeValueFromUserForFirstArray() { // Method will take first set of array as input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of first Array ");
		int size = scan.nextInt();
		int[] numbers = new int[size];
		for (int index = 0; index < numbers.length; index++) { // loop used to take value from user
			numbers[index] = scan.nextInt();
		}
		return numbers;
	}

	int[] takeValueFromUserForSecondArray() { // Method will take the second set of array
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of second Array ");
		int size = scan.nextInt();
		int[] numbers1 = new int[size];
		for (int index = 0; index < numbers1.length; index++){ // loop used to take value from user
			numbers1[index] = scan.nextInt();
		}
		return numbers1;
	}

	void checkBiggerDifferIndex(int[] numbers, int[] numbers1){   //Method to compare & find differ & bigger array values
		for (int index = 0; index < numbers.length; index++){
			if (numbers[index] != numbers1[index]) {			//loop to compare numbers index wise
				System.out.println("Values are not matching at index -> "+index);
				if(numbers[index]>numbers1[index]){
					System.out.println("From ("+numbers[index]+","+numbers1[index]+") max value is "+numbers[index]);
				}
				else{
					System.out.println("From ("+numbers[index]+","+numbers1[index]+") max value is "+numbers1[index]);
				}
			}
		}
	}
}
