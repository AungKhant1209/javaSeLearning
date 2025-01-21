package Day11;

import java.util.Scanner;

public class hw1Duplicate {
    public static String text="Where do you go go go ?";
    public static String[] stringArr=text.split(" ");
    public static int index =stringArr.length;

    public static void main(String[] args ) {
        delete();
        index--;
        display();


    }
    public static void delete(){
        int duplicate=findIndex();
        for (int k = duplicate; k < index-1; k++) {
            stringArr[k]=stringArr[k+1];
        }
    }
    public static void display(){
        for (int k = 0; k < index; k++) {
            System.out.print(" ");
            System.out.print(stringArr[k]);
        }

    }
    public static int findIndex(){
        int indexForFind =stringArr.length;
        for(int i = 0; i < indexForFind; i++) {
            for(int j = i+1; j < indexForFind-1; j++) {
                if (stringArr[i].equals(stringArr[j])) {
                    return j;
                }
            }
        }
        return -1;

    }



}
