package ravi;

public class ClientSwapWithVariable {

	public static void main(String[] args) {
		SwapWithVariable object = new SwapWithVariable();
		System.out.println("Initially number order provided by user is : "+Integer.parseInt(args[0])+" "+Integer.parseInt(args[1]));
		object.swapNumbers(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
	}
}
