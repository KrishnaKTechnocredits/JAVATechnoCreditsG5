package Dipti;

import java.util.Scanner;

public class Area {

	public static final double PI=3.14;
	public static void main(String[] args) {
		int length,bredth,radius;
		System.out.println("Please enter length, bredth and radius");
		Scanner sc= new Scanner(System.in);
		length=sc.nextInt();
		bredth=sc.nextInt();
		radius=sc.nextInt();
		int aor=areaOfRectangle(length,bredth);
		double aoc=areaOfCircle(radius);
		display(aor,aoc);
		sc.close();
	}
	private static void display(int aor, double aoc) {
		// TODO Auto-generated method stub
		System.out.println("Area of Recatangle is "+ aor);
		System.out.println("Area of Circle is "+ aoc);
	}
	private static int areaOfRectangle(int length, int bredth) {
		// TODO Auto-generated method stub
		return (2*(length+bredth));
	}
	private static double areaOfCircle(int radius) {
		// TODO Auto-generated method stub
		return 2*PI*radius;
	}

}
