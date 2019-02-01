package swatiN;

public class ArrayEquality {
	// first checking length of both arrays
	boolean checkarrayequalitylen(int array1[], int array2[]) {
		boolean flag = true;

		if (array1.length != array2.length) {
			flag = false;
		}
		return flag;

	}

	// Checking numbers in array
	boolean checkarrayequality(int array1[], int array2[]) {
		boolean flag1 = false;
		for (int index = 0; index < array1.length; index++) {
			if (array1[index] == array2[index]) {
				flag1 = true;
			}
			else
			{
				flag1 = false;
			}
		}
		return flag1;
	}

	public static void main(String[] args) {
		Inputoutputoperations io = new Inputoutputoperations();
		int[] array1 = io.takeinputint();
		int[] array2 = io.takeinputint();
		ArrayEquality arrayequality = new ArrayEquality();
		boolean flagvalue = arrayequality.checkarrayequalitylen(array1, array2);
		if (flagvalue == false) {
			System.out.println("Two arrays are  not Equal");
		}
		else if (flagvalue==true)
		{
			 boolean flagarrayequality = arrayequality.checkarrayequality(array1, array2);
		if (flagarrayequality == true) {
			System.out.println("Two arrays are Equal");
		}
		else
		{
			System.out.println("Two arrays are  not Equal");
		}
		}	
	}

}		