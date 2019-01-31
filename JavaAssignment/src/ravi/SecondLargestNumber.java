package ravi;
import java.util.Scanner;

/*Class will take array as input and will provide second largest number*/
public class SecondLargestNumber{

	int[] takeValueFromUser() { 				// method to take array as input from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = scan.nextInt();
		int[] numbers = new int[size];
		for (int index = 0; index < numbers.length; index++){ // taking values from console
															
			numbers[index] = scan.nextInt();
		}
		return numbers;
	}

	int calculateSecondLargestNumber(int[] numbers){		//method to calculate second largest number of array
		int maximumNumber = 0;
		int secondLargeNumber = 0;
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] > maximumNumber) {				//to get maximum number directly
				secondLargeNumber = maximumNumber;
				maximumNumber = numbers[index];
			}
			if (numbers[index] > secondLargeNumber && numbers[index] < maximumNumber) {
				secondLargeNumber = numbers[index];	//to make sure we cover scenario where number<max but higher than 2nd largest
			}
		}
		return secondLargeNumber;
	}

}
