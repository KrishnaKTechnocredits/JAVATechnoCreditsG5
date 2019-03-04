package ravi;
import java.util.Scanner;

//Class will take a String and will return reverse String
public class PalindromeWord {

	String takeInputFromUser() {		//taking a word as input from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter word :");
		String input = scan.nextLine();
		input = input.toLowerCase();			//converting all characters to lower case
		scan.close();
		return input;
	}

	String reverseInput(String input) {			// Method to reverse a String
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output = output + input.charAt(index);			//Loop to reverse index of characters
		}
		return output; //returning reverse String
	}
}
