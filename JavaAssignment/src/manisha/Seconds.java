package manisha;

public class Seconds {
	static void Time(int s) {
		int h;
		int m;
		int f;
		{
			if (s < 3600) {
				h = 0;
				m = s / 60;
				f = s % 60;
			} else {
				h = s / 3600;
				f = s % 3600;
				m = f / 60;
				f = f % 60;
			}
			System.out.println("time is " + h + " hours, " + m + "minutes," + f + " seconds");
		}
	}

	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);
		Time(i);
	}

}
