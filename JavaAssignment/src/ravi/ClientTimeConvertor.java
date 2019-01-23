package ravi;

public class ClientTimeConvertor {

	public static void main(String[] args) {
		TimeConvertor object = new TimeConvertor();
		System.out.println("Time(in seconds) proviide by user is : " + Integer.parseInt(args[0]));
		object.convertor(+Integer.parseInt(args[0]));
	}

}
