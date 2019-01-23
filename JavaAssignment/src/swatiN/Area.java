package swatiN;

public class Area {
	static float areaofrect(float len, float br) {
		float AreaofRect = len * br;
		System.out.println("Area of rectangle is" + AreaofRect);
		return AreaofRect;
	}

	static float perimterofrect(float len, float br) {
		float Perimeterofrect = 2 * (len + br);
		System.out.println("Perimeter of rectangle is" + Perimeterofrect);
		return Perimeterofrect;
	}

	static double areaofcircle(float radius) {
		double areaofcir = 2 * 3.14 * radius * radius;
		System.out.println("Area of circle is" + areaofcir);
		return areaofcir;
	}

	static double perimeterofcircle(float radius) {
		double perimeterofcir = 2 * 3.14 * radius;
		System.out.println("Perimeter of circle is" + perimeterofcir);
		return perimeterofcir;
	}

	public static void main(String[] args) {
		float len = Float.parseFloat(args[0]);
		float br = Float.parseFloat(args[1]);
		float r = Float.parseFloat(args[2]);
		areaofrect(len, br);
		perimterofrect(len, br);
		areaofcircle(r);
		perimeterofcircle(r);
	}

}
