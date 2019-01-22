package ravi;

public class CircleRectangle {

	void circleArea(float radius) {
		float area = (float) 3.14 * radius * radius;
		System.out.println("Area of circle is : " + area);
	}

	void circlePerimeter(float radius) {
		float perimeter = (float) 3.14 * 2 * radius;
		System.out.println("Perimeter of circle is : " + perimeter);
	}

	void rectangleArea(float length, float width) {
		float area = (float) length * width;
		System.out.println("Area of rectangle is : " + area);
	}

	void rectanglePerimeter(float length, float width) {
		float perimeter = (float) 2 * (length + width);
		System.out.println("Perimeter of rectangle is : " + perimeter);
	}
}
