package ravi;

public class ClientFindAllDifferIndex{   //Client class to call methods of FindAllDifferIndex
	
	public static void main(String[] args){
		FindAllDifferIndex object=new FindAllDifferIndex();           //object creation for class FindAllDifferIndex
		int[] firstArray=object.takeValueFromUserForFirstArray();     //taking input on console for 1st array
		int[] secondArray=object.takeValueFromUserForSecondArray();   //taking input on console for 2nd array
		object.checkAllDifferIndex(firstArray, secondArray);          //method call to find all differ index
		}

}
