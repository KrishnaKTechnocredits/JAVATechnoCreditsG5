package ravi;

/*Class to call members of class FindLargestSmallestNumber*/
public class ClientFindLargestSmallestNumber{
	
	public static void main(String[] args){
		FindLargestSmallestNumber object=new FindLargestSmallestNumber(); //object to access members of FindLargestSmallestNumber
		int[] numbers=object.takeValueFromUser();
		System.out.println("Largest number of the array is "+object.findLargestNumber(numbers));
		System.out.println("Smallest number of the array is "+object.findSmallestNumber(numbers));
	}
}
