package manisha;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment3 {
	
	public static void main(String[] args) {
		ArrayList<String> al1= new ArrayList<String>();
		String str2= new String();
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		al1.add(sc.nextLine());
		String str3= al1.get(0);
		System.out.println("enter the character");
		String str= sc.next();
		for (int i=0; i<str3.length(); i++)
		{
			if(str3.charAt(i)== str.charAt(0))
			{
				count++;
			}
			
		}
		System.out.println("frequenecy of "+ str + " is "+count);
	}

}
