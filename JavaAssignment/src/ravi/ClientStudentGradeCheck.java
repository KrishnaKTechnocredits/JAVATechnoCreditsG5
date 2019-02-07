package ravi;

//This class will be used to access members of class StudentGradeCheck
public class ClientStudentGradeCheck {

	public static void main(String[] args) {
		StudentGradeCheck object = new StudentGradeCheck();
		object.acceptMarks(); 									// Method call to take marks as input
		object.calculateGrade(); 								// Method call to calculate grade
	}
}
