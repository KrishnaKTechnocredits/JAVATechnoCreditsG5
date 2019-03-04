package ravi;

public class ClientFindDifferIndex{       //Client class to call methods of FindDifferIndex
	
	public static void main(String[] args) {
		FindDifferIndex object=new FindDifferIndex();     //object creation for class FindDifferIndex
		int[] firstArray=object.takeValueFromUserForFirstArray(); 
		int[] secondArray=object.takeValueFromUserForSecondArray();
		System.out.println("Values are not matching at index -> "+object.checkDifferIndex(firstArray, secondArray));
		}
}
