package Day12;

public class homework_1 {
    public static void main(String[] args ) {
        String text="Where";
        String[] stringArr=text.split("");

        int index=stringArr.length;
        for (int i = 0; i < index; index--) {
            System.out.print(stringArr[index-1]);

        }
    }
}
