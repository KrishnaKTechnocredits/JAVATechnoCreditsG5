package ravi;

public class ClientSumEqualToNumber{		//Client method to call members of SumEqualToNumber class

	public static void main(String[] args){
		SumEqualToNumber object = new SumEqualToNumber();  //object creation for class SumEqualToNumber
		int[] numbers = object.takeValueFromUser();			//method call to take input
		object.checkSum(numbers);							//method call to check sum of pair as 7
	}
}
