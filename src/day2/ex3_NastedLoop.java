package day2;

public class ex3_NastedLoop {
    public static void main(String[] args) {
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
}
