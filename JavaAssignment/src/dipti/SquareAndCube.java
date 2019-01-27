package Dipti;

import java.util.Scanner;

public class SquareAndCube {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int square=square(num);
		int cube=cube(num);
		display(square,cube);
		sc.close();
	}

	private static int cube(int num) {
		// TODO Auto-generated method stub
		return num*num*num;
	}

	private static void display(int square, int cube) {
		// TODO Auto-generated method stub
		System.out.println("Square is "+ square);
		System.out.println("Cube is "+ cube);
		
		
	}

	private static int square(int num) {
		return num*num;
		// TODO Auto-generated method stub
		
	}
}
