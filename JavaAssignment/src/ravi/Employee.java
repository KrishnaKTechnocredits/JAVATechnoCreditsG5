package ravi;

//Class will display the details of mentioned employee
public class Employee {
	int empId;				//instance variable declaration
	String empName;
	float empSalary;
	
	Employee(int eId, String eName, float eSalary){   //parameterized constructor to assign dynamic values 
		empId=eId;
		empName=eName;
		empSalary=eSalary;
		}
	
	void displayEmployeeDetails(){					//display method to show Employee details
		System.out.println("Employee Details are as below"); 
		System.out.println("Employee ID --> "+empId);
		System.out.println("Employee ID --> "+empName);
		System.out.println("Employee ID --> "+empSalary);
	}
}
