package kunal;
public class TimeConversion {

    private static final int MINUTES_IN_AN_HOUR = 60;
    private static final int SECONDS_IN_A_MINUTE = 60;

    public static void main(String[] args) {

       int totalSeconds=180 ;

        System.out.println(timeConversion(totalSeconds));

    }

    private static String timeConversion(int totalSeconds) {
    int seconds = totalSeconds % SECONDS_IN_A_MINUTE;
    int totalMinutes = totalSeconds / SECONDS_IN_A_MINUTE;
    int minutes = totalMinutes % MINUTES_IN_AN_HOUR;
    int hours = totalMinutes / MINUTES_IN_AN_HOUR;

        return hours + " hours " + minutes + " minutes " + seconds + " seconds";
    }

    
}