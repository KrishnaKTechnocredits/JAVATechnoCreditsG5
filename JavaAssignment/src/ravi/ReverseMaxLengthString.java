package ravi;

public class ReverseMaxLengthString {
	
	String maximumLengthString(String[] input) { 	//Method to check maximum length string
		String maxLengthString = "";
		for (int index = 0; index < input.length; index++) {
			if (input[index].length() > maxLengthString.length()) {		//Comparison within array objects
				maxLengthString = input[index];
			}
		}
		return maxLengthString;				//return biggest String
	}
	
	String reverseBiggestString(String maxLengthString){			//method to reverse maximum string
		String output="";
		for(int index=maxLengthString.length()-1;index>=0;index--){ 
			output=output+maxLengthString.charAt(index);
		}		
	return output;			//return reversed String
	}
}
