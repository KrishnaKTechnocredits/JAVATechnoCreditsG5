package ravi;

public class Temperature {

	void convertor(float fahrenheit) {
		float celsius = (float) (fahrenheit - 32) * 5 / 9;
		System.out.println("Celsius temperature will be : " + celsius);
	}	
}
