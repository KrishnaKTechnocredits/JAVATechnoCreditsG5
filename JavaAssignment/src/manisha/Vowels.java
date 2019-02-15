//assignment 8

package String;

import java.util.Scanner;

public class Vowels {
	
	public static void main(String[] args) {
		int count=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String str= sc.nextLine();
		for (int i=0; i<=str.length()-1; i++)
		{
		if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
			{
				count++;
			}
		}
		System.out.println("Number of vowels in the string are " + count);
	}

}
