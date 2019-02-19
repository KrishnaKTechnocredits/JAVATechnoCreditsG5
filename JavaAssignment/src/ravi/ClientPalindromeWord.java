package ravi;

/*Client class to access members of class PalindromeWord*/
public class ClientPalindromeWord {

	public static void main(String[] args) {
		PalindromeWord object = new PalindromeWord();
		String input = object.takeInputFromUser(); // taking String as input
		String reverseInput = object.reverseInput(input); // method call to reverse String
		if (input.equals(reverseInput)) {
			System.out.println("Given word is palindrome"); // condition check for palindrome
		} else {
			System.out.println("Word is not palindrome");
		}
	}
}
