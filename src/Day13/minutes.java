package Day13;

import java.util.Scanner;

public class minutes {
    public static void main(String[] args) {

        String answer=null;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter word that you want to encrypt: ");
            String word = scanner.nextLine();
            System.out.print("Enter number of words: ");
            int number= scanner.nextInt();scanner.nextLine();
            codeSurpass(word,number);
            System.out.println();
            System.out.println("Do you want to continue ");
            answer=scanner.nextLine();
        }while(answer.equals("Yes"));


    }
    public static void codeSurpass(String word, int number){
        char[]array=word.toCharArray();
        int index=array.length;
        for(int i=0;i<index;i++){
            char newWord= array[i];

            int intCode=newWord+number;
            while (intCode>122){
                intCode=intCode-123+97;
            }

            char newCode=(char) intCode;
            System.out.print( newCode );
        }
    }
}
