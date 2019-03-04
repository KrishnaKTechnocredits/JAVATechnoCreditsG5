package kunal;

class StudentDetails 
{
	String name;
	int rNo;
	int marks;

	public static void display(String name, int rNo, int marks) 
	{
		System.out.println("Student name is: " + name);
		System.out.println("Student Rollno is: " + rNo);
		System.out.println("Student Marks are: " + marks);
	}

	public static void main(String[] args) 
	{
		String name = args[0];
		int n = Integer.parseInt(args[1]);
		int m = Integer.parseInt(args[2]);
		StudentDetails.display(name, n, m);
	}
}
