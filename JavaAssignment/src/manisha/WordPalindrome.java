//assignment 12

package String;

import java.util.Scanner;

public class WordPalindrome {
	
	public static void main(String[] args) {
		
		String a="";
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string");
		String name= sc.next();
				
		for (int i=name.length()-1; i>=0; i--)
			
		{
			a=a+ name.toLowerCase().charAt(i);
			
			}
		if (a.equals(name.toLowerCase()))
		{
			System.out.println(name +" is a palindrome");
		}
		else
		{
			System.out.println(name + " is not a palindrome");
		}
		
	}

	}

