package ravi;

//Client class to access members of class SumOfTwoArray
public class ClientSumOfTwoArray {
	
	public static void main(String[] args) {
		SumOfTwoArray object=new SumOfTwoArray();
		int[] array1=object.takeNumberFromUser();	//taking array as Input from user
		int[] array2=object.takeNumberFromUser();
		int sum=object.sumOfArrayNumbers(array1)+object.sumOfArrayNumbers(array2);	//method call to perform sum
		System.out.println("Sum of 2 Array is "+sum);
	}
}
