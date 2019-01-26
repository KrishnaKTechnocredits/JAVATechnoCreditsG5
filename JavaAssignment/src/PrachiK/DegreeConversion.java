package PrachiK;

public class DegreeConversion {

	static void degreetoFarenheit(double farenheit) {
		double degree = (farenheit - 32) * 5 / 9;
		System.out.println("Degree to Farenheit coversion is: " + degree);
	}

	public static void main(String[] args) {
		double farenheit = Double.parseDouble(args[0]);
		degreetoFarenheit(farenheit);

	}

}
