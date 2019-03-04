package ravi;
import java.util.Scanner;

//Client to access class Bank
public class BankClient {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String newLine = System.getProperty("line.separator");
		System.out.println("!!           Welcome to our Bank          !!");
		System.out.println("Please provide below details in sequence " + newLine + "1. Account Number :" + newLine
				+ "2. Customer Name : " + newLine + "3. Amount : ");  //Accepting details from user
		String account = scan.next();
		String name = scan.next();
		float amount = scan.nextFloat();

		Bank object = new Bank(account, name, amount);
		int choice = object.optionMenu();					//Method call to display menu
		object.performOperation(choice);					//Method call for request operation
	}
}
