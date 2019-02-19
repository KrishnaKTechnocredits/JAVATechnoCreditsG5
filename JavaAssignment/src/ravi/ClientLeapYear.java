package ravi;

//Class will be used to access members of class LeapYear
public class ClientLeapYear {
	
	public static void main(String[] args) {
		LeapYear object=new LeapYear();
		int year=object.takeValueFromUser();	//Method call to take input
		object.isLeapYear(year);				//Method call to check leap year or not
	}
}
