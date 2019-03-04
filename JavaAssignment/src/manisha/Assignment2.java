package manisha;

import java.util.ArrayList;

public class Assignment2 {
	
	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		ArrayList<String> al2= new ArrayList<String>();
		String str2= new String();
		String str= new String();
		al1.add("all the best");
		al1.add("technocredits");
		al1.add("maharashtra");
		for (int i=0; i<al1.size(); i++)
		{
			
			str= al1.get(i);
			{
				if (str.length()>str2.length())
				{
					str2 = str;
				}
				}
			}
		System.out.println("Maximum length string is "+str2);
		
		
	}

}
