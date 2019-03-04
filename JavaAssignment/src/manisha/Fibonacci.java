//Assignment 4

package String;

import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int x=1;
	while(num>=1)
	{
		x=x*(num);
		num--;
	}
	System.out.println(x);
}
	
}
