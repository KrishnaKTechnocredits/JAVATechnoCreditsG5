package umesh;

class SimpleInterest {

	void calc(double p, double t, double r) {
		double si = (p * t * r) / 100;
		System.out.println("The simple interest is: " + si);
	}

	public static void main(String[] args) {
		SimpleInterest sim = new SimpleInterest();
		double principal, time, rate;
		principal = Double.parseDouble(args[0]);
		time = Double.parseDouble(args[1]);
		rate = Double.parseDouble(args[2]);
		sim.calc(principal, time, rate);
	}

}