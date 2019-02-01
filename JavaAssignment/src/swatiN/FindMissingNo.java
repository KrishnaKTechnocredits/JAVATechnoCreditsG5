package swatiN;

public class FindMissingNo {

	int findmissingno(int num[]) {
		int missingno;
		int actualsumofarrayelements = 0;
		int n = num.length + 1;
		int totalsum = n * (n + 1) / 2;

		for (int index = 0; index < num.length; index++) {
			actualsumofarrayelements = actualsumofarrayelements + num[index];
		}
		missingno = totalsum - actualsumofarrayelements;
		System.out.println("Missing element in an array is" + " " + missingno);
		return missingno;
	}

	public static void main(String[] args) {
		Inputoutputoperations io = new Inputoutputoperations();
		int[] num = io.takeinputint();
		FindMissingNo findmissingno = new FindMissingNo();
		findmissingno.findmissingno(num);
	}
}
