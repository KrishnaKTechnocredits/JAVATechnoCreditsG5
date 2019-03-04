package ravi;

//Client to access members of ReverseMaxLengthString
public class ClientReverseMaxLengthString{
	
	public static void main(String[] args) {
		ReverseMaxLengthString object=new ReverseMaxLengthString();
		String[] input={"all the best","Technocredits"," ","Maharashtra"}; 		//input String array
		String maxLengthString=object.maximumLengthString(input);			//finding maximum length String
		System.out.println("Max Length String -: "+maxLengthString);
		System.out.println("Max Length String reverse value -: "+object.reverseBiggestString(maxLengthString)); //call to reverse string
	}
}
