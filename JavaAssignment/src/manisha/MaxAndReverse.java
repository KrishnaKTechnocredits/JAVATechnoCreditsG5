//assignment 6

package String;

public class MaxAndReverse {
	public static void main(String[] args) {
		
		String[] inp={"all the best", "technocredits", "maharashtra"};
		String max= "";
		String x= "";
		for(int i=0; i<=inp.length-1; i++)
		{
		
		//x=m1(inp[i]);
		if(max.length() <=inp[i].length())
		{
			max=inp[i].trim();
			}
		}
		
		System.out.println("maximum length string is "+max);
		System.out.println("reverse of maximum length string is " +reverse(max));
		}
	static String reverse(String str)
	{
		String a="";
		for(int j=str.length()-1; j>=0; j--)
		{
			 a= a+str.charAt(j);
		}
		return a;
	}

}
