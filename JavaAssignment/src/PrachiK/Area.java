package PrachiK;

public class Area {

	static void rectangle(int width, int height) {
		int area = width * height;
		System.out.println("Area of Rectangle is " + area);
	}

	static void circle(double radius) {
		double area = 2 * 3.14 * radius * radius;
		System.out.println("Area of Circle is " + area);
	}

	public static void main(String[] args) {
		int width = Integer.parseInt(args[0]);
		int height = Integer.parseInt(args[1]);
		double radius = Double.parseDouble(args[2]);
		rectangle(width, height);
		circle(radius);

	}

}
