package swatiN;

public class SimpleIntrest {
	static double calculateSimpleIntrest(double PrincipalAmt, int TimeinYear, double RateofIntrest) {

		double SI = (PrincipalAmt * TimeinYear * RateofIntrest) / 100;
		System.out.println("Calculted Simple Intrest is" + " : " + SI);
		return SI;
	}

	public static void main(String[] args) {
		double pAmt = Double.parseDouble(args[0]);
		int t = Integer.parseInt(args[1]);
		double Rate = Double.parseDouble(args[2]);
		calculateSimpleIntrest(pAmt, t, Rate);

	}
}
