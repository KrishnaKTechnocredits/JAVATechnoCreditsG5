package ravi;

public class TimeConvertor {
	int hours = 00;
	int minutes = 00;
	int second = 00;

	void convertor(int totalSeconds) {
		int hours = totalSeconds / 3600;
		int minutes = (((totalSeconds - (hours * 3600)) / 60));
		int seconds = totalSeconds - (hours * 3600) - (minutes * 60);
		System.out
				.println("Value of time will be : " + hours + " Hours " + minutes + " Minutes " + seconds + " Seconds");

	}
}
