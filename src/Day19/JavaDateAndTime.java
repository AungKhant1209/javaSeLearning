package Day19;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaDateAndTime {
    public static void main(String[] args) {
        // Create a Date object with the current date and time
        Date date1 = new Date();

        // Create a Date object with a specific date (incorrect syntax, corrected below)
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date2 = null;
        try {
            date2 = sdf.parse("23/01/2025");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Define date format
        String format = "dd/MM/yyyy";

        // Print date1 and date2
        System.out.println("Current date1 and time: " + date1.toLocaleString());
        if (date2 != null) {
            System.out.println("Current date2 and time: " + date2.toLocaleString());
        }

        // Format date1 using SimpleDateFormat
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        System.out.println("Current date and time in " + format + " format: " + formatter.format(date1));
    }
}
