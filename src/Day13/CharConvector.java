package Day13;

public class CharConvector {

    public static void main(String[] args) {
        String text = "Where";
        char[] stringArr = text.toCharArray();
        int index=stringArr.length;
        for(int i=0;i<index;i++){
            char word= stringArr[i];
            int intCode=word+1;
            char newCode=(char) intCode;
            System.out.println("Character: " + newCode + ", ASCII Value: " + intCode);
        }
//       char code ='A';
//        int intCode=code+1;
//        System.out.println(intCode);
//        char newCode=(char) intCode;
//
//        System.out.println("Character: " + newCode + ", ASCII Value: " + intCode);
    }
}