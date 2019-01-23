package PrachiK;

public class Area {

	static void areaPerimeterofRectangle(int width, int height) {
		int area = width * height;
		System.out.println("Area of rectangle is: " + area);
		System.out.println("Perimeter of rectangle is: " + (2 * (width + height)));
	}

	static void areaPerimeterofCircle(double radius) {
		double area = 3.14 * radius * radius;
		System.out.println("Area of circle is: " + area);
		System.out.println("Perimeter of circle is: " + (2 * 3.14 * radius));
	}

	public static void main(String[] args) {
		int width = Integer.parseInt(args[0]);
		int height = Integer.parseInt(args[1]);
		double radius = Double.parseDouble(args[2]);
		areaPerimeterofRectangle(width, height);
		areaPerimeterofCircle(radius);

	}

}
