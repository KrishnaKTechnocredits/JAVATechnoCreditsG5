package ravi;

public class ClientSwapWithoutVariable {

	public static void main(String[] args) {
		SwapWithoutVariable object = new SwapWithoutVariable();
		System.out.println("Order of numbers provided by user is : "+Integer.parseInt(args[0])+" "+Integer.parseInt(args[1]));
		object.swapNumbers(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
	}
}
