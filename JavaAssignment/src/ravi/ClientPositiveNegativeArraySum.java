package ravi;

//Class to access members of class PositiveNegativeArraySum
public class ClientPositiveNegativeArraySum {
	
	public static void main(String[] args) {
		PositiveNegativeArraySum object=new PositiveNegativeArraySum();	//object create of class PositiveNegativeArraySum
		int[] numbers={5,6,-9,14,-25,6,7,-14};
		object.sumOfArrayMembers(numbers);				//Method call to check positive and negative numbers
	}
}
