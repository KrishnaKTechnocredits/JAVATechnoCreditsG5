package ravi;

public class ClientFindBiggerDifferIndex {   //client call to access members of class FindBiggerDifferIndex
	
	public static void main(String[] args) {
	FindBiggerDifferIndex object=new FindBiggerDifferIndex();           //object creation for class FindBiggerDifferIndex
	int[] firstArray=object.takeValueFromUserForFirstArray();     //taking input on console for 1st array
	int[] secondArray=object.takeValueFromUserForSecondArray();   //taking input on console for 2nd array
	object.checkBiggerDifferIndex(firstArray, secondArray);          //method call to find differ index & to show bigger number
	}
}
