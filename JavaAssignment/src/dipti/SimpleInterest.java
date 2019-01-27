package Dipti;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		int principal;
		double time, rate;
		System.out.println("Please enter Principal, Time in years and Rate");
		Scanner sc=new Scanner(System.in);
		principal=sc.nextInt();
		time=sc.nextDouble();
		rate=sc.nextDouble();
		
		calculateSimpleInterest(principal,time,rate);
		
		sc.close();
	}

	private static void calculateSimpleInterest(int principal, double time, double rate) {
		double simpleInterest=(principal*time*rate)/100;
		display(simpleInterest);
	}

	private static void display(double simpleInterest) {
		System.out.println("Simple Interest is "+simpleInterest);
		
	}

}
