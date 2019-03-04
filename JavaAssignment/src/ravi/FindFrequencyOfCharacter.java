package ravi;

//Class will provide frequency of a character in given string
public class FindFrequencyOfCharacter{

	int checkFrequency(String input, char characterValue) {		//Method to check frequency of character
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == characterValue) {		//String index comparison
				count++;
			}
		}
		return count;		//return frequency of character
	}
}
