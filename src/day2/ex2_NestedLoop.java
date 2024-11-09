package day2;

public class ex2_NestedLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i < 7) {
            int j = 6;
            while (j > i) {
                System.out.print(" " + j + " ");
                j--;
            }
            System.out.println(" ");
            i++;
        }
    }
}
