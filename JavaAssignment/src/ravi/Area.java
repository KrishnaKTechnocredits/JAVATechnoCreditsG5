package ravi;
import java.util.Scanner;

//Class to calculate area of circle,rectanle,triangle using overloading concept
public class Area {

	private void area(int radius) {						//method to calculate area of circle
		float area = (float) 3.14 * radius * radius;
		System.out.println("Area of circle is " + area);
	}

	private void area(int length, int breadth) {		//method to calculate area of rectangle
		int area = length * breadth;
		System.out.println("Area of rectangle is " + area);
	}

	private void area(float base, float height) {		//method to calculate area of triangle
		float area = (float) 0.5 * base * height;
		System.out.println("Area of triangle is " + area);
	}

	void calculateArea() {								//method to call all area methods 
		System.out.println("Enter radius of circle");
		Scanner scan = new Scanner(System.in);
		int radius = scan.nextInt();
		area(radius);
		System.out.println("Enter length and breadth of rectangle");
		int length = scan.nextInt();
		int breadth = scan.nextInt();
		area(length, breadth);
		System.out.println("Enter base and height for triangle");
		float base = scan.nextFloat();
		float height = scan.nextFloat();
		area(base, height);
	}
}
