package Day25.Util;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
public class DataUtil {
    public static Scanner scanner=new Scanner(System.in);
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

    public static Date stringToDateConvector(String stringDate) throws ParseException {
        Date dateOfBirth = dateFormat.parse(stringDate);
        return dateOfBirth;
    }
    public static int dateToAgeConvector(Date dob){
        Date currentDate=new Date();
        long diff = currentDate.getTime() - dob.getTime();
        int diffDays = (int) ( diff / (24 * 60 * 60 * 360 * 1000));
        return diffDays;
    }
}
