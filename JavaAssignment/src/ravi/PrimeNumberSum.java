package ravi;

public class PrimeNumberSum {
	int sum = 0;

	int isPrime(int number) {
		boolean flag = true;
		for (int start = 2; start <= number / 2; start++) {

			if (number % start == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			sum = sum + number;
		}
		return sum;
	}
}
