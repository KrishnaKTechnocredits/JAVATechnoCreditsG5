package ravi;

//Class can be used to access members of class Circle
public class ClientCircle {

	public static void main(String[] args) {
		Circle object = new Circle();
		float radius = object.takeRadiusFromUser();		//Method call to take radius as input
		object.calculateArea(radius);					//Method call to calculate Area
		object.calculateCircumference(radius);			//Method call to calculate circumference
	}
}
