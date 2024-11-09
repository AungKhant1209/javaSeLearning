package day2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        System.out.println("While Loop");
        Scanner scanner = new Scanner(System.in);

        int x = 0;
        int y = scanner.nextInt();
        while (x<11){
            int result=y*x;
            System.out.println(y+" x "+x+" = "+result);
            x++;
        }
    }
}
