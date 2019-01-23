package umesh;

class SquareAndCube {
	public static void main(String args[]) {
		System.out.println("Number\tSquare\tCube");
		for (int i = 1; i < 20; i++) {
			System.out.println(i + " " + i * i + " " + i * i * i);
		}
	}
}