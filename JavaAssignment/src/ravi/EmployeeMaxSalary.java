package ravi;

/*class will take employee details and will provide details of Employee with maximum salary*/
public class EmployeeMaxSalary {

	String name;												//instance variable declaration
	int deptId;
	int salary;

	EmployeeMaxSalary(String empName, int empDeptId, int empSalary) {		//Constructor to assign dynamic values
		name = empName;
		deptId = empDeptId;
		salary = empSalary;
	}

	//Method will take 2 instance of class as parameter and will provide details of maximum salary employee
	void compareEmpSalary(EmployeeMaxSalary emp1, EmployeeMaxSalary emp2) {
		String newLine = System.getProperty("line.separator");
		if (emp1.salary > emp2.salary) {
			System.out.println("Please find below the details of employee with maximum salary" + newLine
					+ "Employee Name : " + emp1.name + newLine + "Dept Id : " + emp1.deptId + newLine
					+ "Employee Salary : " + emp1.salary);
		} else if(emp1.salary<emp2.salary){									//Condition to check maximum salary 
			System.out.println("Please find below the details of employee with maximum salary" + newLine
					+ "Employee Name : " + emp2.name + newLine + "Dept Id : " + emp2.deptId + newLine
					+ "Employee Salary : " + emp2.salary);
		}
		else{
			System.out.println("Salary is equal for both employee");			//If salary is equal scenario
		}
	}
}
