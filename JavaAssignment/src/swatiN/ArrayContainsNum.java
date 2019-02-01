package swatiN;
//This program is for finding if given number is present in given array
public class ArrayContainsNum {
	boolean flag = false;
	static int number;

	boolean checkifarraycontainsnumber(int num[], int number) {
		for (int index = 0; index < num.length; index++) {
			if (num[index] == number) {
				flag = true;
			}

		}
		return flag;
	}

	public static void main(String[] args) {

		Inputoutputoperations io = new Inputoutputoperations();
		int[] num = io.takeinputint();
		ArrayContainsNum arraycontainsnum = new ArrayContainsNum();
		boolean flagval = arraycontainsnum.checkifarraycontainsnumber(num, 8);
		if (flagval == true) {
			System.out.println("number is present in given array");
		} else {
			System.out.println("number is not present in array");
		}
	}
}
