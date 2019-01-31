package ravi;
import java.util.Scanner;

/*Class will take array as input and will return maximum and minimum number of array*/
public class FindLargestSmallestNumber{
	
	int[] takeValueFromUser(){ 				// method to take array as input from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = scan.nextInt();
		int[] numbers = new int[size];
		for (int index = 0; index < numbers.length; index++){ // taking values from console
			numbers[index] = scan.nextInt();
		}
		return numbers;
	}
	
	int findLargestNumber(int[] numbers){		//Method to find maximum number in array
		int largest=numbers[0];
		for(int index=1;index<numbers.length;index++){
			if(numbers[index]>largest){			//compare with each index one by one
				largest=numbers[index];
			}
		}
		return largest;
	}
	
	int findSmallestNumber(int[] numbers){		//Method to find smallest number in array
		int smallest=numbers[0];
		for(int index=1;index<numbers.length;index++){
			if(numbers[index]<smallest){		//compare with each index one by one
				smallest=numbers[index];
			}
		}
		return smallest;
	}
	
}
