import java.util.*;

public class TimeFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter time in seconds: ");
        int totalSeconds = sc.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        // Format into HH:MM:SS
        String time = String.format("%02d:%02d:%02d", hours, minutes, seconds);

        System.out.println("Time in HH:MM:SS format: " + time);
    }
}
