package ravi;

//Class will take array as input and will provide positive and negative numbers with their sum
public class PositiveNegativeArraySum {

	void sumOfArrayMembers(int numbers[]) {								//Method to check positive negative and sum
		int[] positiveNumbers = new int[numbers.length];
		int[] negativeNumbers = new int[numbers.length];
		int positiveSum = 0, positiveIndex = 0;
		int negativeSum = 0, negativeIndex = 0;
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] > 0) {									//Condition to check positive numbers
				positiveNumbers[positiveIndex] = numbers[index];
				positiveIndex++;
				positiveSum = positiveSum + numbers[index];
			} else if (numbers[index] < 0) {							//Condition to check negative numbers
				negativeNumbers[negativeIndex] = numbers[index];
				negativeIndex++;
				negativeSum = negativeSum + numbers[index];
			}
		}
		System.out.print("a. Positive numbers are {");
		for(int index=0;index<positiveIndex;index++){				//printing positive numbers in user requested format
			System.out.print(+positiveNumbers[index]+" ");
		}
		System.out.println("}");
		System.out.print("b. Negative numbers are {");
		for(int index=0;index<negativeIndex;index++){				//printing positive numbers in user requested format
			System.out.print(+negativeNumbers[index]+" ");
		}
		System.out.println("}");
		System.out.println("c. Sum of positive numbers is " + positiveSum);			//sum of positive numbers
		System.out.println("d. Sum of negative numbers is " + negativeSum);			//sum of negative numbers
	}
}
