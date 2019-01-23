package ravi;

public class ClientTemperature {

	public static void main(String[] args) {
		Temperature object = new Temperature();
		object.convertor(Float.parseFloat(args[0]));
	}
}
