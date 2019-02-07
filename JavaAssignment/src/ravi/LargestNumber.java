package ravi;
import java.util.Scanner;

//This class will take 3 numbers as input and will find the largest number
public class LargestNumber{

	int[] takeInputFromUser() {					//This method will take 3 numbers from user as input
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 3 numbers: ");
		int[] numbers = new int[3];
		for (int index = 0; index < numbers.length; index++){		//for loop to take input from user via console
			numbers[index] = scan.nextInt();
		}
		return numbers;
	}

	void checkLargestNumber(int[] numbers) {		//This method will find the largest number

		if (numbers[0] > numbers[1] && numbers[0] > numbers[2]){         //Condition to confirm if first numbers is largest
			System.out.println("Largeest number is : " + numbers[0]);
		} else if (numbers[1] > numbers[0] && numbers[1] > numbers[2]){  //Condition to confirm if second numbers is largest
			System.out.println("Largeest number is : " + numbers[1]);
		} else{
			System.out.println("Largest number is : " + numbers[2]);	 //Condition to confirm if third numbers is largest
		}
	}
}
