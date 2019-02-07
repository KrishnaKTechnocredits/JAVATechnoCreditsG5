package ravi;
import java.util.Scanner;

//This class will identify if a given year is leap year or not
public class LeapYear{

	int takeValueFromUser() {		//Method to take year input from user
		System.out.println("Please enter the year : ");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		return year;
	}

	void isLeapYear(int year) {			//Method to check if given year is leap year or not
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {	//Condition to identify leap year
			System.out.println("This is a leap year");
		} else {
			System.out.println("This is not a leap year");		//Not a leap year in false condition
		}
	}
}
