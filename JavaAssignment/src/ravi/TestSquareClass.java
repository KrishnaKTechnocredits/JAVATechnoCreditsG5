package ravi;
import java.util.Scanner;

//Class to test class Square
public class TestSquareClass {

	public static void main(String[] args) {
		System.out.println("Enter the side of square in meters "); //taking side as input from user in meters
		Scanner scan = new Scanner(System.in);
		float side = scan.nextFloat();
		Square object = new Square(side);		//side value passed to constructor
		object.AreaOfSquare();					//Method call to calculate area
	}
}
