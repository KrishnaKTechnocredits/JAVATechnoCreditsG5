package ravi;

public class ClientArrayEqualityCheck {  //client class for ArrayEqualityCheck

	public static void main(String[] args) {
		ArrayEqualityCheck object=new ArrayEqualityCheck();      //object to call members of ArrayEqualityCheck
		int[] firstArray=object.takeValueFromUserForFirstArray();  //Take first array as input from user
		int[] secondArray=object.takeValueFromUserForSecondArray(); //Take second array as input from user
		boolean flag=object.compareArray(firstArray, secondArray);
		if(flag==true){										//condition check for Array compare
			System.out.println("Both the Array are equal");
		}
		else{
			System.out.println("Arrays are not equal");
		}
	}
}
