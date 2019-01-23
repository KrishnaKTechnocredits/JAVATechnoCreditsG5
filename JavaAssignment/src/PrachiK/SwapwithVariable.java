package PrachiK;

public class SwapwithVariable {

	static void swap(int variable1, int variable2) {
		int variable3 = variable2;
		variable2 =variable1;
		variable1 =variable3;
		System.out.println("After Swap the answer of a is: " + variable1 + " and b is: " + variable2);
	}

	public static void main(String[] args) {
		int variable1 = Integer.parseInt(args[0]);
		int variable2 = Integer.parseInt(args[1]);
		swap(variable1, variable2);

	}

}
