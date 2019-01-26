package PrachiK;

public class HourMinSec {

	static void conversion(int sec) {
		int minutes = sec / 60;
		int hour = sec / 3600;
		sec = sec % 60;
		System.out.println("hour is: " + hour + "\nminute is: " + minutes + "\nseconds is: " + sec);

	}

	public static void main(String[] args) {

		int sec = Integer.parseInt(args[0]);
		conversion(sec);
	}

}
