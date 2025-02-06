package Day19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args) {
        // Create a Date object with the current date and time
        Date date = new Date();
        System.out.println("Current Date and Time: " + date);

        // Format 1: "yyyy-MM-dd HH:mm:ss"
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate1 = dateFormat1.format(date);
        System.out.println("Date Format 1 :: " + formattedDate1);

        // Format 2: "mm/dd/yyyy"
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("MM/dd/yyyy");
        String formattedDate2 = dateFormat2.format(date);
        System.out.println("Date Format 2 :: " + formattedDate2);

        // Find date difference
        Date date1 = new Date();
        try {
            // Parse a given date string to Date object
            Date date2 = dateFormat1.parse("2024-11-01 12:00:00");

            // Calculate difference in milliseconds
            long diff = date2.getTime() - date1.getTime();

            // Convert milliseconds to days
            long diffDays = diff / (24 * 60 * 60 * 1000);

            System.out.println("Date difference in days :: " + diffDays);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
