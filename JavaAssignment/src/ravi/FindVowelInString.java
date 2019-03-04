package ravi;

import java.util.Scanner;

/*Class will take string as input and will provide count of vowels in it*/
public class FindVowelInString {

	String takeNumberFromUser() { // Method to take String as input from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter String");
		String word = scan.nextLine();
		scan.close();
		return word;				//returning input String
	}

	int findVowelCount(String input) {				//method to calculate count of vowels
		input = input.toLowerCase();				//lower case conversion
		int count = 0;
		for (int index = 0; index < input.length(); index++) {			//compare all character of String with vowels
			if (input.charAt(index) == 'a' || input.charAt(index) == 'e' || input.charAt(index) == 'i'
					|| input.charAt(index) == 'o' || input.charAt(index) == 'u') {
				count++;
			}
		}
		return count;			//returning count of vowels
	}
}
