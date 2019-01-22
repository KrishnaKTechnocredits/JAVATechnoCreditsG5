package kunal;
public class SquareCube
{
	void Display(float number)
	{
		float Square;
		float Cube;
		Square = number * number;
        Cube = number * number * number;
		
        System.out.println("Square of number is : " + Square);
        System.out.println("Cube of number is : " + Cube);
	}
	
    public static void main(String[] args)
    {
        SquareCube sq = new SquareCube();
		float f=Float.parseFloat(args[0]);
		sq.Display(f);
    }
}