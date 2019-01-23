package ravi;

public class ClientPrimeNumberSum {
	public static void main(String[] args) {
		PrimeNumberSum object = new PrimeNumberSum();
		int start;
		int sum = 0;
		int end = Integer.parseInt(args[1]);

		for (start = Integer.parseInt(args[0]); start < end; start++) {
			sum = object.isPrime(start);
		}
		System.out.println("Sum of all prime numbers between " +Integer.parseInt(args[0]) + " and " + end + " is : " + sum);
	}
}
