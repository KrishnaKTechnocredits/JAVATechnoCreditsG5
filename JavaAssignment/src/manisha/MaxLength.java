//assignment 2

package String;

public class MaxLength {

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
		
		System.out.println(max);
		}
	}
