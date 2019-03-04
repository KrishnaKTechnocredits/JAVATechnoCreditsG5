package kunal;

class SumPrimeNumber
{
	static boolean SumPrime(int num)
	{
		boolean flag =true;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i == 0)
			{
				flag = false;
				break;
			}						
		}
		return flag;
	}
	
	public static void main(String[] a)
	{	int sum=0;
		int from = Integer.parseInt(a[0]);
		int to = Integer.parseInt(a[1]);
		for(int i=from;i<=to;i++)
		{
			boolean  f =SumPrime(i);
			if(f== true)
			{
				sum=sum+i;
			}	
		}		
			System.out.println("Sum of all prime numbers between " +from +" and " +to +" is "+ sum);	
			
	}
}