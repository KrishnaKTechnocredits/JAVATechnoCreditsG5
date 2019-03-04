//assignment 9

package String;

public class ArrayAverage {
	
	public static void main(String[] args) {
		
		int[] inp= {13, 32, 19, 14, 78, 36};
		double a=0;
		for(int i=0; i<inp.length; i++)
		{
			a=a+inp[i];
		}
		double c= a/inp.length;
		System.out.println("Average is "+c);
	}

}
