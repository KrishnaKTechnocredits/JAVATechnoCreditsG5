//assignment 13

package String;

import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the number");//153
		int number= sc.nextInt();
		int j=m1(number);
		if(number == j)
		{
			System.out.println("number is armstrong");
			}
		else
			System.out.println("number is not armstrong");
	}

		
		static int m1(int num)
		{
			int y=0;
			int a=0;
			int x=0;
		while(num>=1)
			
		{
			a= num%10;//0
			x= a*a*a;//125
			y=y+x;//27+125
			num=num/10;//1
			}
		return y;
		}
		

		
		
}
