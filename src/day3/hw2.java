package day3;

import java.util.Scanner;

public class hw2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("end")) {
            System.out.print("Enter multiplier number:");
            int multiplier = scanner.nextInt();scanner.nextLine();
            multiplicationTablePrinter(multiplier);
            System.out.print("do you want to continue:");
            input = scanner.nextLine();
        }

    }
    public static void multiplicationTablePrinter(int multiplier){
        int count = 0;
        while (count<11){
            int result=multiplier*count;
            System.out.println(multiplier+" x "+count+" = "+result);
            count++;
        }
    }

}
