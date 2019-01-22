package ravi;

public class SimpleInterest {

	void calculateInterest(float amount, float time, float rate) {
		float interest = (amount * time * rate) / 100;
		System.out.println("Simple interest for specified details is : " + interest);
	}
}
