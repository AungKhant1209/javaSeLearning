package day3;

import java.util.Scanner;

public class FunctionEx3 {
    public static void add(int a, int b) {
        System.out.println(a + b);
    }
    public static void sub(int a, int b) {
        System.out.println(a - b);
    }
    public static void multiple(int a, int b) {
        System.out.println(a * b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter option number: ");
        int number = scanner.nextInt();
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        if (number==1){
            add(a,b);
        }else if (number==2){
            sub(a,b);
        }else if(number==3){
            multiple(a,b);
        }
    }
}
