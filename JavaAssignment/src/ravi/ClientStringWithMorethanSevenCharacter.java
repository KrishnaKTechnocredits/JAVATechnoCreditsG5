package ravi;

//Client class to access class StringWithMorethanSevenCharacter
public class ClientStringWithMorethanSevenCharacter {

	public static void main(String[] args) {
		StringWithMorethanSevenCharacter object = new StringWithMorethanSevenCharacter();
		String[] input = { "Krishnaa", "Maulik", "Aakash", "Aakansha", "Ravi", "Technocredits" };//input array
		object.isStringBigger(input);	//method call to get String more than 7 characters
	}
}
