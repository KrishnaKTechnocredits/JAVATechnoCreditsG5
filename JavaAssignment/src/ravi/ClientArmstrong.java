package ravi;

/*Client to access members of class Armstrong*/
public class ClientArmstrong{

	public static void main(String[] args){
		Armstrong object = new Armstrong();
		int number = object.takeNumberFromUser();		//taking number as input from user
		int output = object.isArmstrong(number);		//sum of each digit cube
		System.out.println(output);
		if (number == output)							//number and Armstrong condition compare
			System.out.println(number + " is Armstrong Number");		
		else
			System.out.println(number + " is not a Armstrong Number");
	}
}
