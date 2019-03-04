package ravi;

//Client class for AverageOfArray
public class ClientAverageOfArray {

	public static void main(String[] args) {
		AverageOfArray object=new AverageOfArray();
		int[] input=object.takeNumberFromUser();		//taking array as input
		float average=object.average(input);			//method call to get average
		System.out.println("Average of array numbers is : "+average);
	}
}
