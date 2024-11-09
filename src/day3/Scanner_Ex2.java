package day3;

import java.util.Scanner;

public class Scanner_Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        while (number != 4) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Withdraw");
                    break;
                case 2:
                    System.out.println("Deposit");
                    break;
                case 3:
                    System.out.println("Transfer");
                    break;

            }

        }
    }
}
