
//Taking two numbers as input from user and print the Addition, Subtraction, Multiplication, Division and Remainder 
package Dipti;

public class Assignment1_operation {
		
	static void disSum(int a, int b)
	{
		int x = a+b;
		System.out.println("Addition of numbers is " +x);
	}
	
	static void disSub(int a, int b)
	{
		int x = a-b;
		System.out.println("Subtraction of numbers is " +x);
	}
	
	static void disMult(int a, int b)
	{
		int x = a*b;
		System.out.println("Multiplication of numbers is " +x);
	}
	
	static void disDiv(int a, int b)
	{
		int x;
		if(b != 0)
			{
			x = a/b;
			System.out.println("Division of numbers is " +x);
			}
		else
		System.out.println("Please enter 2nd number as non zero to get division");
	}
	
	static void disRem(int a, int b)
	{
		int x;
		if(b != 0)
			{
			x = a%b;
			System.out.println("Division of numbers is " +x);
			}
		else
			System.out.println("Please enter 2nd number as non zero to get division");
		
	}
	
	public static void main(String[] args)
	{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		Assignment1_operation.disSum(num1, num2);
		Assignment1_operation.disSub(num1, num2);
		Assignment1_operation.disMult(num1, num2);
		Assignment1_operation.disDiv(num1, num2);
		Assignment1_operation.disRem(num1, num2);
	}

}
