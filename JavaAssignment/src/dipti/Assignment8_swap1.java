package Dipti;

public class Assignment8_swap1 {
	
	public static void main(String[] args)
	{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3;
		num3=num2;
		num2=num1;
		num1=num3;
		System.out.println("Swapped numbers are "+num1+" "+num2);
	}

}
