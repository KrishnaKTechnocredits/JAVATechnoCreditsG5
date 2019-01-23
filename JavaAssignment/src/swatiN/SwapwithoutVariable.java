package swatiN;

public class SwapwithoutVariable {

			void swapnumbers(int firstnum,int secondnum)
		{
			firstnum=firstnum+secondnum;
			secondnum=firstnum-secondnum;
			firstnum=firstnum-secondnum;
			System.out.println(firstnum+"is swaped value of first num");
			System.out.println(secondnum+"is swaped value of second num");
		}
		
		public static void main(String[] args) {
			int a= Integer.parseInt(args[0]);
			int b= Integer.parseInt(args[1]);
			SwapwithoutVariable sw= new SwapwithoutVariable();
			sw.swapnumbers(a,b);
		}
		
	}

