package ravi;

/*Class will take input array as input and will print String with more than 7 characters*/
public class StringWithMorethanSevenCharacter {
		
	void isStringBigger(String[] input){					//Method to check String length > 7
		for(int index=0;index<input.length;index++){
			if(input[index].length()>7){
				System.out.print(input[index]+" ");	//printing more than 7 character String
			}
		}
	}
}
