package ravi;

public class ClientOperationSquareCube {
	public static void main(String[] args) {
		OperationSquareCube object = new OperationSquareCube();
		System.out.println("Square of number is : " + object.performSquare(Integer.parseInt(args[0])));
		System.out.println("Cube of number is : " + object.performCube(Integer.parseInt(args[0])));
	}
}
