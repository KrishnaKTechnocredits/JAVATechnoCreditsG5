package ravi;

public class ClientFindVisibleTree { //Class consist of main method for class FindVisibleTree

	public static void main(String[] args) {
		FindVisibleTree object = new FindVisibleTree(); //creating object to call methods of FindVisibleTree class
		int[] numbers = object.takeValueFromUser();
		System.out.println("Count of visible trees are : " + object.findVisibleValues(numbers));
	}
}