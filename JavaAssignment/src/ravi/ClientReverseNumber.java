package ravi;

//class to access members of ReverseNumber
public class ClientReverseNumber{
	
	public static void main(String[] args) {
		ReverseNumber object=new ReverseNumber();	
		int number=object.takeNumberFromUser();			//taking number form user
		System.out.println("Reverse of number will be "+object.reverser(number));		//method call to reverse number
	}

}
