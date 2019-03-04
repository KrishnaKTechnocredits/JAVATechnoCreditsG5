//assignment 10

package String;

public class SumOfArray {
	
	static int m1(int[] num)
	{
		int a=0;
		for (int i=0; i<num.length; i++)
		{
			a=a+num[i];
		}
		return a;
		
	}
	public static void main(String[] args) {
		int[] inp1={1, 5, 9, 3, 7};
		int[] inp2={1, 7, 9, 3};
		int b= m1(inp1);
		int c=m1(inp2);
		System.out.println("sum of arrays is "+ (b+c));
	}

}
