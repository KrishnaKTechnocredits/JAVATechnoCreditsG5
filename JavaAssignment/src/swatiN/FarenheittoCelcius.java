package swatiN;

public class FarenheittoCelcius {
void convertFarenheittocelcius(float TempinFarenheit)
	
	{
		float TempinCelcius= (TempinFarenheit-32)*5/9;
		System.out.println(TempinCelcius);
	}

	public static void main(String[] args) {
		float temp=Float.parseFloat(args[0]);
		FarenheittoCelcius fc= new FarenheittoCelcius();
		fc.convertFarenheittocelcius(temp);
	}
}

