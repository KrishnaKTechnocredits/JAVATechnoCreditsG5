package ravi;
import java.util.Scanner;

public class ClientCheckIfNumberExist {  //class created to call class CheckIfNumberExist

	public static void main(String[] args) {
		CheckIfNumberExist object = new CheckIfNumberExist();//method call to take input from user
		int[] numbers = object.takeValueFromUser();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value to check array");
		int value = scan.nextInt();
		if (object.findIfNumberExist(numbers, value) == true) {  //checking the value from class method to identify if number exist
			System.out.println("Number exist in the array");
		} else {
			System.out.println("Number does not exist in array");
		}
	}
}
