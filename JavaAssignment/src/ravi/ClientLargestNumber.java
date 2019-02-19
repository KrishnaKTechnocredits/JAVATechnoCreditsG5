package ravi;

//Class will be used to access members of class LargestNumber
public class ClientLargestNumber {
	
	public static void main(String[] args) {
		LargestNumber object=new LargestNumber();
		int[] numbers=object.takeInputFromUser();
		object.checkLargestNumber(numbers);
	}

}
