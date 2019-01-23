package ravi;

public class ClientCalculation {	
	public static void main(String[] args) {
		Calculation object = new Calculation();
		object.performAddition(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		object.performSubstraction(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		object.performMultiplication(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		object.performDivision(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		object.performModular(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
	}
}
