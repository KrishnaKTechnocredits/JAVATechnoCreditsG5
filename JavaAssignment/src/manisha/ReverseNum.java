//Assignment 5

package String;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		String num;
		String b="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.next();
		for (int i=num.length()-1; i>=0; i--)
		{
			b=b+ num.charAt(i);
		}
		System.out.println("reverse of number is "+b);
	}
}
