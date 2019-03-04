package String;

public class StringLength {
	public static void main(String[] args) {
		String[] inp1={"krishna", "maulik", "aakash", "harsh", "aakansha", "abhishek"};
		for(int i=0; i<=inp1.length-1; i++)
		{
			String str=inp1[i];
			if(str.length()>=7)
			{
				System.out.print(str + ",");
			}
		}
		
	}

}
