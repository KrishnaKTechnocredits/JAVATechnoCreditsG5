package ravi;
import java.util.Scanner;

//class to access members of class CalculatorUsingSwitch
public class ClientCalculatorUsingSwitch {
	
	public static void main(String[] args) {
		System.out.println("Enter 2 numbers : ");		//Taking numbers from users on console
		Scanner scan=new Scanner(System.in);
		int number1=scan.nextInt();	
		int number2=scan.nextInt();
		CalculatorUsingSwitch object=new CalculatorUsingSwitch();
		String choice=object.takeUserAction();			//Method call to take user choice operation
		
		switch (choice){								//Switch case to perform operation of user choice
		case "Add":
			object.addition(number1, number2);
			break;
		case "Substract":
			object.substraction(number1, number2);
			break;
		case "Multiply":
			object.multiply(number1, number2);
			break;
		case "Divide":
			object.divide(number1, number2);
			break;
		}
	}

}
