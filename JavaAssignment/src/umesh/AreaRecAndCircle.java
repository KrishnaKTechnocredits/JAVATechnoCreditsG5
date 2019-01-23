package umesh;

class AreaRecAndCircle {
	public static void main(String args[]) {
		int l = 10;
		int b = 20;
		int rec, perimeter;
		double pi = 3.14, rad = 3.5, area, cirperi;
		rec = l * b;
		System.out.println("Area of Rectangle is:" + rec);
		perimeter = 2 * (l + b);
		System.out.println("Perimeter of Rectangle is:" + perimeter);
		area = pi * rad * rad;
		System.out.println("Area of Circle is:" + area);
		cirperi = 2 * pi * rad;
		System.out.println("Perimeter of Rectangle is:" + cirperi);
	}
}