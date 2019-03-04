package ravi;

//Class to access members of Factorial
public class ClientFactorial{
	
	public static void main(String[] args) {
		Factorial object=new Factorial();
		int number=object.takeNumberFromUser();		//taking number from user
		System.out.println("Factorial : "+object.factorial(number));		//getting factorial value
		}
}
