package Dipti;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		float fahrenheit;
		System.out.println("Please enter Fahrenheit");
		Scanner sc=new Scanner(System.in);
		fahrenheit=sc.nextFloat();
		ftoc(fahrenheit);
		sc.close();
	}

	private static void ftoc(float fahrenheit) {
		double celsius;
		celsius=(fahrenheit-32)*5/9;
		display(celsius);
	}

	private static void display(double celsius) {
		System.out.println("fahrenheit is converted into celsius "+celsius);
	}

}
