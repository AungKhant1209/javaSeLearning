package Day4;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //squat
        System.out.print("Enter rep for squat:");
        int repSquat = scanner.nextInt();
        System.out.print("Enter set for squat:");
        int setSquat = scanner.nextInt();
        //legExtension
        System.out.print("Enter rep for legExtension:");
        int repExt = scanner.nextInt();
        System.out.print("Enter set for legExtension:");
        int setExt = scanner.nextInt();
        //legPress
        System.out.print("Enter rep for legPress:");
        int repPress = scanner.nextInt();
        System.out.print("Enter set for legPress:");
        int setPress = scanner.nextInt();
        //lunge
        System.out.print("Enter rep for legLunge:");
        int repLunge = scanner.nextInt();
        System.out.print("Enter set for legLunge:");
        int setLunge = scanner.nextInt();
        int number=0;
        if (squat(repSquat,setSquat)){
            number++;
        }
        if (legExtension(repExt,setExt)){
            number++;
        }
        if (legPress(repPress,setPress)){
            number++;
        }
        if (lunge(repLunge,setLunge)){
            number++;
        }
        ///
        if (number == 4) {
            System.out.println("Your workout is done.");
        } else if (number == 3) {
            System.out.println("One workout is needed to be done more.");
        } else if (number == 2) {
            System.out.println("Just 50% of workout is done.");
        } else if (number == 1) {
            System.out.println("U do not even complete 50% of your leg-workout list.");
        } else {
            System.out.println("No workout completed.");
        }


        ///
        if (!squat(repSquat,setSquat)){
            System.out.println("You failed squat today");
        }
        if (!legExtension(repExt,setExt)){
            System.out.println("You failed leg-extension today");
        }
        if (!legPress(repPress,setPress)){
            System.out.println("You failed leg-press today");
        }
        if (!lunge(repLunge,setLunge)){
            System.out.println("You failed lunge today");
        }




    }

    public static boolean squat(int rep, int set) {
        if (rep > 9 && set > 9) {
            return true;
        } else {
            return false;
        }

    }
    public static boolean legExtension(int rep, int set) {
        if (rep > 9 && set > 9) {
            return true;
        } else if (rep < 10 && set < 10) {
            return false;
        }
        return false;//i have to ask ko felix
    }
    public static boolean legPress(int rep, int set) {
        if (rep > 9 && set > 9) {
            return true;
        } else if (rep < 10 && set < 10) {
            return false;
        }
        return false;//i have to ask ko felix
    }
    public static boolean lunge(int rep, int set) {
        if (rep > 9 && set > 9) {
            return true;
        } else if (rep < 10 && set < 10) {
            return false;
        }
        return false;//i have to ask ko felix
    }
}