package ravi;
import java.util.Scanner;

//Class to access members of CalculateArea class
public class ClientCalculateArea {

	public static void main(String[] args) {
		CalculateArea object = new CalculateArea();
		int operation = object.takeUserAction();		//Method call to check user requirement
		Scanner scan = new Scanner(System.in);

		switch (operation) {
		case 1:															//case to calculate circle area
			System.out.println("Please enter radius in meter ");
			float radius = scan.nextFloat();
			object.areaCircle(radius);
			break;
		case 2:
			System.out.println("Please enter base and height in meter ");		//case to calculate triangle area
			float base = scan.nextFloat();
			float height = scan.nextFloat();
			object.areaTriangle(base, height);
			break;
		case 3:
			System.out.println("Please enter length and breadth in meter ");		//case to calculate rectangle area
			float length = scan.nextFloat();
			float breadth = scan.nextFloat();
			object.areaRectangle(length, breadth);
			break;
		}

	}

}
