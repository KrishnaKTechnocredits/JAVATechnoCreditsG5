package swatiN;

public class StudentDetails {

	static void studentdetails(int rollno, String name, int marks) {
		System.out
				.println("Student Details are-Name:" + " " + name + " " + "Rollno:" + rollno + " " + "marks:" + marks);

	}

	public static void main(String[] args) {

		int RollNum = Integer.parseInt(args[0]);
		String Name = args[1];
		int marks = Integer.parseInt(args[2]);
		studentdetails(RollNum, Name, marks);
	}
}
