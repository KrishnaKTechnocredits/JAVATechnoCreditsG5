//Assignment 3

package String;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string");
	String str=sc.nextLine();
	int count=0;
	for (int i=0; i<=str.length()-1; i++)
	{
		if(str.charAt(i) == 'e')
		{
			count++;
		}
					
	}
	System.out.println("number of times character iterated is "+ count);
}
}
