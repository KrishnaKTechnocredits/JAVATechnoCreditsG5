package ravi;
import java.util.Scanner;

//Class will take one number as input and will find the weekday
public class DisplayWeekDay{
	int number;

	DisplayWeekDay(int value){		//constructor to assign dynamic value to instance member 
		number = value;
	}

	void findWeekDay(){				//Method to check weekday for given number
		switch (number % 7){
		case 0:
			System.out.println("This day will be Sunday");
			break;
		case 1:
			System.out.println("This day will be Monday");
			break;
		case 2:
			System.out.println("This day will be Tuesday");
			break;
		case 3:
			System.out.println("This day will be Wedneday");
			break;
		case 4:
			System.out.println("This day will be Thursday");
			break;
		case 5:
			System.out.println("This day will be Friday");
			break;
		case 6:
			System.out.println("This day will be Saturday");
			break;
		}
	}
}
