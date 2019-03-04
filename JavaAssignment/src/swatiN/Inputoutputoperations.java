package swatiN;

import java.util.Scanner;

public class Inputoutputoperations {

	int[] takeinputint() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of input");
		int size = sc.nextInt();
		int[] num = new int[size];

		for (int index = 0; index < num.length; index++) {
			num[index] = sc.nextInt();
		}
		return num;
	}

	public static void main(String[] args) {
		Inputoutputoperations io = new Inputoutputoperations();
		int[] num = io.takeinputint();
	}
}