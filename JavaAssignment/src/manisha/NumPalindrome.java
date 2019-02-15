//assignment 11

package String;

import java.util.Scanner;

public class NumPalindrome {
			
	public static void main(String[] args) {
		String a="";
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		String num= sc.next();
				
		for (int i=num.length()-1; i>=0; i--)
			
		{
			a=a+num.charAt(i);
			
			}
		if (a.equals(num))
		{
			System.out.println(num +" is a palindrome");
		}
		else
		{
			System.out.println(num + " is not a palindrome");
		}
		
	}

	
	}
	
