package ravi;
import java.util.Scanner;

//Class will take marks of Student as input and will provide Grades
public class StudentGradeCheck {
	int marks;

	void acceptMarks() {									//Method to take marks as input
		System.out.println("Please enter the marks : ");
		Scanner scan = new Scanner(System.in);
		marks = scan.nextInt();
	}

	void calculateGrade() {									//Method to calculate grades
		if (marks > 0 && marks <= 50) {						//Fail grade condition
			System.out.println("Failed");
		} else if (marks > 50 && marks <= 75) {				//1st class condition
			System.out.println("1st Class");
		} else if (marks > 75 && marks <= 100) {
			System.out.println("Distinction");				//Distinction condition
		} else {
			System.out.println("Invalid marks detail");		//Marks not entered in specified range
		}
	}
}
