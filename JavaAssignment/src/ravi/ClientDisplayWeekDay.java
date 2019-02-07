package ravi;
import java.util.Scanner;

//Class to access members of class DisplayWeekDay
public class ClientDisplayWeekDay {
	
	public static void main(String[] args) {
		System.out.println("Please enter the number :");	//Taking number as input from user
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		DisplayWeekDay object=new DisplayWeekDay(number);	//passing number to constructor to create object
		object.findWeekDay();								//Method call to find weekday for given number
	}

}
