package ravi;

public class Temperature {

	void convertor(float fahrenheit) {
		float celsius = (float) (fahrenheit - 32) * 5 / 9;
		System.out.println("Fahrenheit temperature will be : " + celsius);
	}	
}
