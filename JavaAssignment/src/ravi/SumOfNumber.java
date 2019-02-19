package ravi;
import java.util.Scanner;

//Class will take number as input and will return sum of it's digits
public class SumOfNumber{

	int takeNumberFromUser() {							//Method to take number as input from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int number = scan.nextInt();
		scan.close();
		return number;
	}

	int performSum(int number) {				//Calculating sum of digits
		int sum = 0;
		int temp;
		while (number > 0) {					//Loop to split number digit by digit
			temp = number % 10;
			sum = sum + temp;
			number = number / 10;
		}
		return sum;					//return sum of digits
	}
}
