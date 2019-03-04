package ravi;

public class ClientFindDuplicateNumber { // client class for FindDuplicateNumber

	public static void main(String[] args) {
		FindDuplicateNumber object = new FindDuplicateNumber(); // object to call member of ClientFindDuplicateNumber
		int[] numbers = object.takeValueFromUser();  
		System.out.println("Duplicate number is " + object.checkDuplicatedNumber(numbers));
	}
}
