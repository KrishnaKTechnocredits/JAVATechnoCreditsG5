package PrachiK;

public class SquareCube {
	
	int a;
	
	void square(int a) {
		int b = a * a;
		System.out.println("Square is : " + b);
	}

	void cube(int a) {
		int b = a * a * a;
		System.out.println("Cube is : " + b);
	}

	public static void main(String[] args) {
		SquareCube sc1 = new SquareCube();
		sc1.a = Integer.parseInt(args[0]);
		sc1.square(sc1.a);
		sc1.cube(sc1.a);
		

	}

}
