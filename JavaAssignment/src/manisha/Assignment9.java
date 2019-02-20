package manisha;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment9 {
	static double c=0;
	
	public static void main(String[] args) {
	ArrayList<Integer> al1= new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	for(int i=0; i<6; i++)
	{
	al1.add(sc.nextInt());
	
	}
	System.out.println("average of array is"+average(al1));
	
	}

	
static double average(ArrayList al2)

{
	int sum=0;
	for(int i=0; i<al2.size(); i++)
	{
		sum=sum+ (int) al2.get(i);
	}
	c= sum/al2.size();
	return c;
	
}
}



