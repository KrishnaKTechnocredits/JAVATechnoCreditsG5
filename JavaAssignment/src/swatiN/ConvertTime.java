package swatiN;

public class ConvertTime {

	static void converttime(int timeinsec) {
		int min = timeinsec / 60;
		int hr = timeinsec / 3600;
		int sec = timeinsec % 60;

		System.out.println("Hr:" + hr + " " + "min:" + min + " " + "sec:" + sec);
	}

	public static void main(String[] args) {
		int time = Integer.parseInt(args[0]);
		converttime(time);
	}
}
