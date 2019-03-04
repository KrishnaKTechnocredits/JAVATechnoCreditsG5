package praveen;

public class swap {
static void swapNum(int a,int b){
	int c = a+b;
	a=c-a;
	b=c-b;
	System.out.println("a value is "+a+" b value is "+b);
}
public static void main(String[] args) {
	swapNum(10, 20);
}
}
