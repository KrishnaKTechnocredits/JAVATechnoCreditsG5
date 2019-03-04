package ravi;
import java.util.Scanner;

/*Class will take an array as input and will give the pair of numbers whose sum will be 7*/
public class SumEqualToNumber{

	int[] takeValueFromUser(){								//method to take array as input from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = scan.nextInt();
		int[] numbers = new int[size];
		for (int index = 0; index < numbers.length; index++) {		//taking values from console
			numbers[index] = scan.nextInt();
		}
		return numbers;
	}

	void checkSum(int[] numbers){							//method to check if sum of pairs is 7
		System.out.println("Integer numbers, whose sum is equal to value: 7");
		for (int index = 0; index < numbers.length; index++) {
			for (int count = 1; count < numbers.length; count++) {
				if (count > index) {
					if ((numbers[index] + numbers[count]) == 7) {		//conditional statement to check sum as 7
						System.out.println("(" + numbers[index] + "," + numbers[count] + ")");
					}
				}
			}
		}
	}
}
