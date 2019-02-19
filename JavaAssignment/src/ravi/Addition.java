package ravi;

//Class with same method name to add integers,decimal and strings
public class Addition {
	
	void add(int number1,int number2){			//method to add 2 integers
		int result=number1+number2;
		System.out.println("Sum is "+result);
	}
	
	void add(float number1,float number2){		//method to add 2 decimals
		float result=number1+number2;
		System.out.println("Sum is "+result);
	}
	
	void add(String string1,String string2){		//method to add 2 strings
		String result=string1+string2;
		System.out.println("Sum is "+result);
	}
}
