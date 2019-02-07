package ravi;
import java.util.Scanner;

//This class will take radius from user and will calculate area/circumference of circle
public class Circle {

	float takeRadiusFromUser() {			//Method to take radius from user
		System.out.println("Enter the radius value");
		Scanner scan = new Scanner(System.in);
		float radius = scan.nextFloat();
		return radius;						//return radius as float to be used in other methods
	}

	void calculateArea(float radius) {			//Method to find circle area
		float area = (float) 3.14 * radius * radius;
		System.out.println("Area of circle is " + area);
	}

	void calculateCircumference(float radius) {		//Method to find Circumference of circle
		float circumference = (float) 3.14 * 2 * radius;
		System.out.println("Circumference of circle is " + circumference);
	}
}
