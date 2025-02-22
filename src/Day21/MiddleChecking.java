package Day21;

import java.util.Scanner;

public class MiddleChecking {
    public static Scanner scanner = new Scanner(System.in);
    public static void input(){
        System.out.println("Write a word:");

        String str= scanner.nextLine();
        int left = 0;
        int right = str.length() - 1;
        boolean check=true;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                check=false;
                break;
            }
            left++;
            right--;
        }
        if (check==true){
            System.out.println("True");
        }else{
            System.out.println("False");
        }



    }
    public static boolean recursive(String letter, int left, int right){
        if((left-right)==0||right-left==1){
            return true;
        }else{
            return letter.charAt(left)==letter.charAt(right) && recursive(letter, left + 1, right - 1);
        }
    }




    public static void main(String[] args) {
        String str="hkkakkkkkh";
        int i=0;
        int length=str.length()-1;
        System.out.println(recursive(str,i,length));

//        String choice="";
//        do{
//            input();
//            System.out.println("Do you want to continue(yes/no):");
//            choice= scanner.nextLine();
//        }while(choice.equals("yes"));

    }


//    do{
//        System.out.println( "Hello World do" );
//        count3--;
//    }while(count3>0);
}
