package ravi;
import java.util.Scanner;

//Client class to access members of EmployeeMaxSalary. 2 objects of EmployeeMaxSalary needs to be created
public class ClientEmployeeMaxSalary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter Name, department Id and Salary for first Employee "); //first employee details
		String nameEmployee1 = scan.next();
		int deptEmployee1 = scan.nextInt();
		int salaryEmployee1 = scan.nextInt();
		EmployeeMaxSalary employee1 = new EmployeeMaxSalary(nameEmployee1, deptEmployee1, salaryEmployee1);
		System.out.println("Please enter Name, department Id and Salary for Second Employee "); //Second employee details
		String nameEmployee2 = scan.next();
		int deptEmployee2 = scan.nextInt();
		int salaryEmployee2 = scan.nextInt();
		EmployeeMaxSalary employee2 = new EmployeeMaxSalary(nameEmployee2, deptEmployee2, salaryEmployee2); 
		employee1.compareEmpSalary(employee1, employee2);          //Method call to return details of max salary employee
	}
}
