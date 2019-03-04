package ravi;
import java.util.Scanner;

//Class will take one number as input and will check Armstrong condition on it
public class Armstrong {

	int takeNumberFromUser() { // Method to take number as input from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int number = scan.nextInt();
		scan.close();
		return number;		//returning input number
	}

	int isArmstrong(int number) {	//method to check Armstrong condition on number
		int temp = 0;
		int output = 0;
		while (number > 0) {		//loop for each digit split 
			temp = number % 10;
			output = output + temp * temp * temp;
			number = number / 10;
		}
		return output;			//returning number post Armstrong condition check
	}
}
