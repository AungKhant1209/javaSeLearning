package Day24.Service;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();  // Might cause an error if input is not a number
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Error! Please enter a valid number.");
        }

        System.out.println("Program continues...");
    }
}
