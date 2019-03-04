package ravi;
import java.util.Scanner;

/*Class will take a number as input and will return the reverse number*/
public class PalinromeNumber {

	int takeNumberFromUser() { // Method to take number as input from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int number = scan.nextInt();
		scan.close();
		return number;
	}

	int reverser(int number) { // Method to reverse number
		int output = 0;
		int temp = 0;
		while (number > 0) { // loop to split numbers in digit and to reverse
			temp = number % 10;
			output = output * 10 + temp;
			number = number / 10;
		}
		return output; // return reverse number
	}
}
