package umesh;

class TemperatureFtoC {
	public static void main(String args[]) {
		TemperatureFtoC t = new TemperatureFtoC();
		t.temp(Double.parseDouble(args[0]));
	}

	void temp(double fahrenheit) {
		System.out.println("Enter the temperature in fahrenheit");
		double celcius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Temperature in Celcius is:" + celcius);
	}
}