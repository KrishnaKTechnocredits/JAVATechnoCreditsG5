package kunal;
public class PerimeterArea 
{
    int radius, length, breadth;
    double pi = 3.14;
	double perimeter;
	double Area;
	double Area1;
   
    void circle(int radius)
    {
        perimeter = 2 * pi * radius;
		Area1= pi * radius * radius;
        System.out.println("Perimeter of circle:"+perimeter);
		System.out.println("Area of circle:"+Area1);
    } 
    
    void rectangle(int length,int breadth)
    {
        perimeter = 2 * (length + breadth);
		Area= length * breadth;
        System.out.println("Perimeter of rectangle:"+perimeter);
		System.out.println("Area of rectangle:"+Area);
    }
   
    public static void main(String[] args) 
    {
        PerimeterArea obj = new PerimeterArea();
		int n = Integer.parseInt(args[0]);
	    int m = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);
        obj.circle(n);
        obj.rectangle(m,k);   
    }
}