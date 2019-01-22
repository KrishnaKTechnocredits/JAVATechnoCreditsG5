package kunal;
public class SimpleInterest 
{
	double SimpleInterest;
   
    void calculation(int p,int t,int r)
    {
		SimpleInterest = (p *t * r)/100;
        System.out.println("Simple Interest is:"+SimpleInterest);
	} 
    
    public static void main(String[] args) 
    {
        SimpleInterest SI = new SimpleInterest();
		int a = Integer.parseInt(args[0]);
	    int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
        SI.calculation(a,b,c);    
    }
}
