package ravi;

//Class to access members of class SumOfNumber
public class ClientSumOfNumber {
	
	public static void main(String[] args) {
		SumOfNumber object=new SumOfNumber();
		int number=object.takeNumberFromUser();	//taking input from user
		System.out.println("Sum of given number is "+object.performSum(number));		//Method call to get sum of digits
	}
}
