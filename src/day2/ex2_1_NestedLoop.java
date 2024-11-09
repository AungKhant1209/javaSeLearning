package day2;

public class ex2_1_NestedLoop {
    public static void main(String[] args) {

        int i=5;
        while (i>=1){
            int j=i;
            while(j>=1){
                System.out.print(" "+j+" ");
                j--;
            }
            System.out.println(" ");
            i--;
        }
    }
}
