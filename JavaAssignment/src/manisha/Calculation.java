package manisha;

public class Calculation {
	static void Add(int x, int y)
	{
		System.out.println("Sum is " + (x+y));
	}
static void Sub(int x, int y)
{
	System.out.println("Substraction is " + (x-y));
}
static void Mul(int x, int y)
{
	System.out.println("Substraction is " + (x*y));
}
static void Div(int x, int y)
{
	System.out.println("Substraction is " + (x/y));
}
static void Rem(int x, int y)
{
	System.out.println("Substraction is " + (x%y));
}
public static void main(String[] args) {
	int i = Integer.parseInt(args[0]);
	int j = Integer.parseInt(args[0]);
	Add(i, j);
	Sub(i, j);
	Mul(i, j);
	Div(i, j);
	Rem(i, j);
}
}
