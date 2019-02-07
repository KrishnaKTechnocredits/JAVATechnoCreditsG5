package ravi;

//Class will have one parameterized constructor and will calculate area of square
public class Square {
	float side;
	
	Square(float sideValue){		//parameterized constructor will accept side of square
		side=sideValue;
	}
	
	void AreaOfSquare(){				//Method to calculate area of square
		float area=(float)side*side;
		System.out.println("Area of Square is "+area+" meters");
	}
}
