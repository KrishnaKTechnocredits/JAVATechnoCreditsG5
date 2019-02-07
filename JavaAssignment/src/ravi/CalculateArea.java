package ravi;
import java.util.Scanner;

//Class take required parameters and calculate area of user selected structure
public class CalculateArea {
	float area;

	int takeUserAction() { 										// Method to take user operation
		System.out.println("Please select the operation");
		String newLine = System.getProperty("line.separator");
		System.out.println("1. Please enter 1 for Area of Circle : " + newLine
				+ "2. Please enter 2 for Area of Triangle : " + newLine + "3. Please enter 3 for Area of Rectangle : ");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt(); 							// Variable to store choice of user
		return choice;
	}

	void areaCircle(float radius) {								//Method will take radius and provide area of circle
		area = (float) 3.14 * radius * radius;
		System.out.println("Area of Circle is " + area);
	}

	void areaTriangle(float base, float height) {		//Method takes base and height to calculate triangle area
		area = (float) 1 / 2 * base * height;
		System.out.println("Area of Triangle is " + area);
	}

	void areaRectangle(float length, float breadth) {		//Method takes length and breadth & calculate rectangle area
		area = (float) length * breadth;
		System.out.println("Area of Rectangle is " + area);
	}
}
