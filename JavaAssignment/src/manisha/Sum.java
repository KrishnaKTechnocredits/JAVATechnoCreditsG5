//Assignment 4

package String;

import java.util.Scanner;

public class Sum {
	
	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the number");
		int number= sc.nextInt();
		int j=m1(number);
		System.out.println("sum of number is "+ j);
		
	}

		
		static int m1(int num)
		{
			int y=0;
			int a=0;
			int x=0;
		while(num>=1)
			
		{
			a= num%10;//3
			y=y+a;
			num=num/10;
			}
		return y;
		}
		

	}
