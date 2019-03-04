package ravi;

//Class will take string array as input and will return string with maximum length
public class FindMaximumLengthString {

	String maximumLengthString(String[] input) { 	//Method to check maximum length string
		String maxLengthString = "";
		for (int index = 0; index < input.length; index++) {
			if (input[index].length() > maxLengthString.length()) {		//Comparison within array objects
				maxLengthString = input[index];
			}
		}
		return maxLengthString;				//return biggest String
	}
}
