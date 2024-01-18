package gr.aueb.cf;
import java.util.Locale;
import java.util.Scanner;
public class Metatropi {
    public static void main(String[] args) {
        final int sec_per_day = 3600 * 24;
        final int sec_per_hour = 3600 ;
        final int sec_per_minute = 60;
        Scanner sc = new Scanner(System.in);
        long days, houres,minutes,sec;
        long total_sec;

        System.out.println("give days,houres and minutes,seconts");
        days = sc.nextLong();
        houres = sc.nextLong();
        minutes = sc.nextLong();
        sec = sc.nextLong();

        total_sec = (days * sec_per_day) + (houres * sec_per_hour) + (minutes * sec_per_minute) + sec;
        System.out.printf(Locale.US,"Total Sec: %,d",total_sec);
    }
}
