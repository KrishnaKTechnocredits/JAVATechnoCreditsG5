package Dipti;

public class Assignment9_swap2 {
	
	public static void main(String[] args)
	{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("Swapped numbers are "+num1+" "+num2);
	}
}
