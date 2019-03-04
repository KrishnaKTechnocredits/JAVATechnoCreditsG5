package kunal;

public class Temprature 
{
	float Celsius;
	   
    void convert(float fahrenheit)
    {
		Celsius = (fahrenheit - 32) * 5/9;
        System.out.println("Temprature is:"+Celsius);
	} 
    
    public static void main(String[] args) 
    {
        Temprature temp = new Temprature();
	    float f=Float.parseFloat(args[0]);
        temp.convert(f);    
    }
}
