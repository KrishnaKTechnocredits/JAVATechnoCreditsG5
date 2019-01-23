package kunal;

class ArithmeticOperation 
{
	int num1;
	int num2;
	int total;

	int sum(int num1, int num2) 
	{
		int total = num1 + num2;
		return total;
	}

	int min(int num1, int num2) 
	{
		int total = num1 - num2;
		return total;
	}

	int mul(int num1, int num2) 
	{
		int total = num1 * num2;
		return total;
	}

	int div(int num1, int num2) 
	{
		int total = num1 / num2;
		return total;
	}

	int mod(int num1, int num2) 
	{
		int total = num1 % num2;
		return total;
	}

	public static void main(String[] args) 
	{
		ArithmeticOperation O1 = new ArithmeticOperation();

		int n = Integer.parseInt(args[0]);
		int n1 = Integer.parseInt(args[1]);
		int sum = O1.sum(n,n1);
		int min = O1.min(n,n1);
		int mul = O1.mul(n,n1);
		int div = O1.div(n,n1);
		int mod = O1.mod(n,n1);

		System.out.println("Addition of Two Number is: " + sum);
		System.out.println("Subtraction of Two Number is: " + min);
		System.out.println("Multiplication of Two Number is: " + mul);
		System.out.println("Division of Two Number is: " + div);
		System.out.println("Remainder of Two Number is: " + mod);
	}

}
