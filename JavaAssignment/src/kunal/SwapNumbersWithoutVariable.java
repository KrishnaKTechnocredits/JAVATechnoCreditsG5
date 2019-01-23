package kunal;
class SwapNumbersWithoutVariable
{
    void Swappng(int num1,int num2)
	{
	  System.out.println("Before Swapping Numbers are: num1 = "+num1+" num2 = "+num2);
	  num1 = num1 + num2;
	  num2=num1-num2;  
      num1=num1-num2; 
      System.out.println("After Swapping Numbers are: num1 = "+num1+" num2 = "+num2);
	}
   
   public static void main(String args[])
   {
		SwapNumbersWithoutVariable SNWV = new SwapNumbersWithoutVariable();
		int n = Integer.parseInt(args[0]);
	    int m = Integer.parseInt(args[1]);
		SNWV.Swappng(n,m);
   }
}