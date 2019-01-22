package ravi;

public class ClientSimpleInterest {

	public static void main(String[] args) {
		SimpleInterest object = new SimpleInterest();
		object.calculateInterest(Float.parseFloat(args[0]), Float.parseFloat(args[1]), Float.parseFloat(args[2]));
	}
}
