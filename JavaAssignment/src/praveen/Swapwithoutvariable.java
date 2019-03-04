package praveen;

public class Swapwithoutvariable {
	static void swapNum(int a,int b){
		
		a=a+b;//30
		b=a-b;//
		a=a-b;
		System.out.println("a value is "+a+" b value is "+b);
	}
	public static void main(String[] args) {
		swapNum(80, 200);
	}

}
