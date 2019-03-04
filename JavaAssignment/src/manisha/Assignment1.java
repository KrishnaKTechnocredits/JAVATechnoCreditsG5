package CollectionAssignment;

import java.util.ArrayList;

public class Assignment1 {
	
	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<Integer>();
		ArrayList<Integer> al2= new ArrayList<Integer>();
		ArrayList<Integer> al3= new ArrayList<Integer>();
		int j=0;
		int g=0;
		
		al.add(5);
		al.add(6);
		al.add(-9);
		al.add(14);
		al.add(-25);
		al.add(6);
		al.add(7);
		al.add(-14);
		
		for(int i=0; i<al.size(); i++)
		{
			if(al.get(i)<0)
			{
				al2.add(al.get(i));
				j=j+al.get(i);
			}
			else
			{
				al3.add(al.get(i));
				g=g+al.get(i);
			}
			
		}
		System.out.println(al2);
		System.out.println(al3);
		System.out.println("sum of negative array is "+j);
		System.out.println("sum of positive array is "+g);
	}
	

}
