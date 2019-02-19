package ravi;

//Class to access members of class FindVowelInString
public class ClientFindVowelInString{

	public static void main(String[] args) {
		FindVowelInString object = new FindVowelInString();
		String input = object.takeNumberFromUser();			//taking String from user
		int count = object.findVowelCount(input);			//getting number of vowels by method call
		System.out.println("Count of vowels in given string : " + count);
	}
}
