package ravi;
import java.util.Scanner;

//Class to access/test members of class Employee 
public class ClientEmployee {

	public static void main(String[] args) {
		System.out.println("Please enter Id, Name and Salary of employee "); //taking input from user
		Scanner scan = new Scanner(System.in);
		int eId = scan.nextInt();
		String eName = scan.next();
		float eSalary = scan.nextFloat();
		Employee object = new Employee(eId, eName, eSalary);	//object creation with parameterized constructor
		object.displayEmployeeDetails();						//display method call
	}
}
