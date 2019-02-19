package ravi;
import java.util.Scanner;

//Client to access members of class FindFrequencyOfCharacter
public class ClientFindFrequencyOfCharacter {

	public static void main(String[] args) {
		FindFrequencyOfCharacter object = new FindFrequencyOfCharacter();   //object of class FindFrequencyOfCharacter
		System.out.println("Please enter String");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		System.out.println("Enter Character - ");    		//String and character as user input
		char charValue = scan.next().charAt(0);
		int frequency = object.checkFrequency(input, charValue);		//method call to get frequency of character
		System.out.println("Count of " + charValue + " -: " + frequency);
		scan.close();
	}
}
