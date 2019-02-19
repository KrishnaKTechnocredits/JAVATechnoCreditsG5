package ravi;

public class ClientSecondLargestNumber{   //Client class to call members of SecondLargestNumber

	public static void main(String[] args) {
		SecondLargestNumber object = new SecondLargestNumber();	//object creation to access SecondLargestNumber members
		int[] numbers = object.takeValueFromUser();		//method call to take input
		System.out.println("Second larget number of array is " + object.calculateSecondLargestNumber(numbers));
	}
}
