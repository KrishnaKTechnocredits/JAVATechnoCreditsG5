package manisha;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment4 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	ArrayList<Integer> al1= new ArrayList();
	System.out.println("Enter the number");//1234
	al1.add(sc.nextInt());
	int num= al1.get(0);
	System.out.println(sum(num));
	}


	static int sum(int num1)
	{
	int b=0;
	int a;
	{
	while(num1>0)
	{
		a= num1%10;//4//3
		num1=num1/10;//123//12
		b= b+a;//4//4+3
		
	}
	return b;
	}
	}
	}

