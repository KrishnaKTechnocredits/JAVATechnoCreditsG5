package swatiN;

public class DifferIndex {
	boolean flag = false;

	boolean checkDifferentIndex(int array1[], int array2[]) {
		for (int index = 0; index < array1.length; index++) {
			if (array1[index] == array2[index]) {
				flag = true;
				// System.out.println("Values are not matching at index"+"
				// "+index);
			} else {
				System.out.println("Values are not matching at index" + " " + index);
				break;

			}

		}
		return flag;
	}

	public static void main(String[] args) {
		Inputoutputoperations io = new Inputoutputoperations();
		int[] array1 = io.takeinputint();
		int[] array2 = io.takeinputint();
		DifferIndex differindex = new DifferIndex();
		boolean flag = differindex.checkDifferentIndex(array1, array2);
		

	}
}