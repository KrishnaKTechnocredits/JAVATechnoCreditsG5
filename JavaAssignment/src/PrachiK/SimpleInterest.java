package PrachiK;

public class SimpleInterest {

	static void interest(double p,double t, double r)
	{
		double si=(p*t*r)/100;
		System.out.println("The simple interest is: "+si);
	}
	public static void main(String[] args) {
		
		double p,t,r;
		p=Double.parseDouble(args[0]);
		t=Double.parseDouble(args[1]);
		r=Double.parseDouble(args[2]);
		interest(p,t,r);
	}

}
