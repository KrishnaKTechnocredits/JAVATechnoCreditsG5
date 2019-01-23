package umesh;
class StudentInfo
{
	String studentname;
	int rollNo;
	int studentmarks;

 	public static void display(String studentname,int rollNo,int studentmarks) 
	{
		System.out.println("Student name is: "+studentname);
		System.out.println("Student Rollno is: " +rollNo);
		System.out.println("Student Marks are: " +studentmarks);
	}

 	public static void main(String[] a) 
	{
		String studentname = a[0];
		int c = Integer.parseInt(a[1]);
		int d = Integer.parseInt(a[2]);
		StudentInfo.display(studentname, c, d);
	}
}