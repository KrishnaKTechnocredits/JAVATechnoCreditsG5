package manisha;

public class AreaPerm {
	static void Perimeter(int l, int w) {
		int x = 2 * (l + w);
		System.out.println("Perimeter of rectangle is " + x);
	}

	static void Area(int l, int w) {
		int y = l * w;
		System.out.println("Area of rectangle is " + y);
	}

	static void Circum(int r) {
		double c = 3.14 * r * r;
		System.out.println("Perimeter of circle is " + c);

	}

	static void CircleaArea(int r) {
		double a = 2 * 3.14 * r;
		System.out.println("Area of circle is " + a);

	}

	public static void main(String[] args) {
		Perimeter(2, 6);
		Area(10, 35);
		Circum(45);
		CircleaArea(15);
	}
}
