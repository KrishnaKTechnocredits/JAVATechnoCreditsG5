package ravi;

public class ClientFindMisingNumber {

	public static void main(String[] args) {
		FindMisingNumber object = new FindMisingNumber();  //creating object to access member of FindMissingClass
		int[] numbers = object.takeValueFromUser();
		object.displayMissingValue(object.expectedSum(numbers), object.actualSum(numbers));
	}

}
