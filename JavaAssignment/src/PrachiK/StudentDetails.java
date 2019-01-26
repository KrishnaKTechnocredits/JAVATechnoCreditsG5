package PrachiK;

public class StudentDetails {
	static int rollno, marks;
	static String name;

	static void showDetails() {
		System.out.println("Student Name is: " + name + "\nRoll no is: " + rollno + "\nMarks: " + marks);

	}

	public static void main(String[] args) {
		rollno = Integer.parseInt(args[0]);
		marks = Integer.parseInt(args[1]);
		name = args[2];
		showDetails();
	}

}
