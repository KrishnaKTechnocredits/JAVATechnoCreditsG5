package ravi;

//Class to access members of class FindMaximumLengthString
public class ClientFindMaximumLengthString{

	public static void main(String[] args) {
		FindMaximumLengthString object = new FindMaximumLengthString();
		String[] input = { "all the best", "Technocredits", "", "Maharashtra" };	//input string
		String maxLengthString = object.maximumLengthString(input);		//Method call to get maximum length string
		System.out.println("Maximum length string is '" + maxLengthString + "' with length " + maxLengthString.length());
	}
}
