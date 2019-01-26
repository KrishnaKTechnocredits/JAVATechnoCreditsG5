package kunal;

public class SwapNumbersWithVariable 
{
	void Swap(int num1, int num2) 
	{
		int temp;
		System.out.println("Before Swapping Numbers are: num1 = " + num1 + " num2 = " + num2);
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After Swapping Numbers are: num1 = " + num1 + " num2 = " + num2);
	}

	public static void main(String args[]) 
	{
		SwapNumbersWithVariable SNWV = new SwapNumbersWithVariable();
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		SNWV.Swap(n, m);
	}
}
