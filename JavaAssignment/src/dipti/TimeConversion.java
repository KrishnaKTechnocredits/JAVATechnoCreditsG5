package Dipti;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		int seconds;
		System.out.println("Enter time in seconds");
		Scanner sc=new Scanner(System.in);
		seconds=sc.nextInt();
		int min=seconds/60;
		int hour=min/60;
		seconds=seconds%60;
		System.out.println("hour :"+hour+" minutes :"+min+": seconds"+seconds);
		sc.close();
	}
}
