package ravi;
import java.util.Scanner;

//It is a menu driven Bank class. Will perform operations as per user request
public class Bank {
	String account_no, name;
	float amount;
	Scanner scan = new Scanner(System.in);
	String newLine = System.getProperty("line.separator");

	Bank(String accNumber, String custName, float accBalence) {   //Constructor to assign dynamic values to instance variable
		account_no = accNumber;
		name = custName;
		amount = accBalence;
	}

	int optionMenu() {											//Method to display option menu 
		System.out.println("Please select the option ");
		System.out.println("1. Please enter 1 to deposit " + newLine + "2. Please enter 2 to withdrawl" + newLine
				+ "3. Please enter 3 for balence enquiry" + newLine + "4. Please enter 4 to display details" + newLine
				+ "5. Please enter 5 to add new customer details");
		int option = scan.nextInt();
		return option;
	}

	void performOperation(int option) {  					//Method to perform different operations using switch 
		switch (option) {
		case 1:
			deposit();
			break;
		case 2:
			withdrawl();
			break;
		case 3:												//Different cases to perform different operations
			checkBalence();
			break;
		case 4:
			displayDetails();
			break;
		case 5:
			insertData();
			break;
		}

	}

	private void insertData() {							//Method will insert data for new customer

		System.out.println("Please provide below details in sequence " + newLine + "1. Account Number :" + newLine
				+ "2. Customer Name : " + newLine + "3. Amount : ");

		account_no = scan.next();
		name = scan.next();
		amount = scan.nextFloat();
	}

	private void deposit() {							//Method to deposit amount
		System.out.println("Please enter the amount you want to deposit");
		float depositAmount = scan.nextFloat();
		amount = amount + depositAmount;
		System.out.println("Available balence is account now is : " + amount);
	}

	private void withdrawl() {							//Method to withdraw amount
		System.out.println("Please enter the amount you want to withdraw");
		float withdrawlAmount = scan.nextFloat();
		if (amount > withdrawlAmount) {					//condition to make sure available amount is more than withdraw amount
			amount = amount - withdrawlAmount;
			System.out.println("Available balence is account now is : " + amount);
		} else {
			System.out.println("You do not have sufficient balence for this transection");
		}
	}

	private void checkBalence() {						//Method to check amount
		System.out.println("Available balence is account now is : " + amount);
	}

	private void displayDetails() {						//Method to display customer details
		System.out.println("Account number is " + account_no);
		System.out.println("Customer name : " + name);
		System.out.println("Available balence : " + amount);
	}

}
