package swatiN;

public class SquareandCube {

	int findsquare(int num)
	{
		int square= num*num;
		System.out.println("Square of a number is"+" "+ square);
		return square;
	}
	
	int findcube(int num)
    {
		int cube= num*num*num;
		System.out.println("Cube of a number is"+" "+ cube);
		return cube;
	}
	
	public static void main(String[] args) {
		int num1= Integer.parseInt(args[0]);
		int num2= Integer.parseInt(args[1]);

		SquareandCube sc = new SquareandCube();
		sc.findsquare(num1);
	    sc.findcube(num2);
		
	}

}
