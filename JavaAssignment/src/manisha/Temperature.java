package manisha;

public class Temperature {
	
	static void Temp(int f)
	{
		double c=((f-32)*5)/9;
		System.out.println("Temperature in celcius is " +c +" degrees");
	}
	
	public static void main(String[] args)
	{
		int i = Integer.parseInt(args[0]);
		Temp(i);
	}

}
