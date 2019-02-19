package ravi;

/*Client class to access members of class PalinromeNumber*/
public class ClientPalinromeNumber {

	public static void main(String[] args) {
		PalinromeNumber object = new PalinromeNumber();
		int number = object.takeNumberFromUser();		//taking number as input from user
		int reverseNumber = object.reverser(number);	//method call to reverse the number
		if (number == reverseNumber) {
			System.out.println("Given number is palindrome");	//condition check for palindrome number
		} else {
			System.out.println("Number is not palindrome");
		}
	}
}
