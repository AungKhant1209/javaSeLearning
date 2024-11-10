package Day5;

import java.util.Scanner;

public class Function_lec_01 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Information information = getInformation();
        boolean response= processOfBooking(information);
        if (response){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
    public static Information getInformation() {
        Information information = new Information();
        System.out.println("Enter pick-up-location:");
        information.pickUpLocation = scanner.nextLine();
        System.out.println("Enter destination:");
        information.destination = scanner.nextLine();
        System.out.println("Enter time:");
        information.time = scanner.nextLine();
        System.out.println("Enter number-of-seats:");
        information.numberOfSeats = scanner.nextInt();scanner.nextLine();
        System.out.println("Enter number of phone-number:");
        information.phNumber = scanner.nextLine();
        return information;
    }

    public static class Information{
        String pickUpLocation;
        String destination;
        String time;
        int numberOfSeats;
        String phNumber;
    }
    public static boolean processOfBooking(Information information) {
        if (information.numberOfSeats >20 || information.pickUpLocation.equals("")
                || information.destination.equals("")||!(information.destination.equals("mega bangna")||information.destination.equals("siam"))
                || information.time.equals("") || information.phNumber.equals("")) {
            return false;

        }
        System.out.println("Process of Booking is Completed");
        System.out.println("Process of Booking is Completed");
        return true;
    }
}
