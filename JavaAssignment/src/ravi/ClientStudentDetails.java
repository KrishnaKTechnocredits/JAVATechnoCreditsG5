package ravi;

public class ClientStudentDetails {
	public static void main(String[] args) {
		StudentDetails object = new StudentDetails();
		object.showDetails(Integer.parseInt(args[0]), args[1], Integer.parseInt(args[2]));
	}
}
