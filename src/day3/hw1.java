package day3;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input="";
        System.out.println("!!!Welcome From Star Patten Printer!!!");
        do {
            System.out.print("Enter a number: ");
            int  option = scanner.nextInt();scanner.nextLine();
            switch (option) {
                case 1:
                    square();
                    break;
                case 2:
                    triangle();
                    break;
                case 3:
                    reverseTriangle();
                    break;
                default:
                   System.out.println("Invalid Option");
                   break;
               }
                System.out.print("do you want to end? (yes/no): ");
                input = scanner.nextLine();
        } while (!input.equals("yes"));
    }

    public static void square() {
        int l=1;
        while (l<7){
            int j=1;
            while(j<=5){
                System.out.print(" * ");
                j++;
            }
            System.out.println(" ");
            l++;
        }
    }
    public static void triangle() {
        int i=1;
        while (i<7){
            int j=1;
            while(j<=i){
                System.out.print(" "+"*"+" ");
                j++;
            }
            System.out.println(" ");
            i++;
        }


    }
    public static void reverseTriangle() {
        int i = 1;
        while (i < 7) {
            int j = 6;
            while (j > i) {
                System.out.print(" " + "*" + " ");
                j--;
            }
            System.out.println(" ");
            i++;
        }
    }
}
