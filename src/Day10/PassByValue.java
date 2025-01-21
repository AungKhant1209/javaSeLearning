package Day10;

public class PassByValue {
    public static void updateInteger(int value){
        value = value * 2;
        System.out.println("Updated Integer in functon: " + value);
    }

    public static void updateIntegerWapper(Integer value){
        value = value * 2;
        System.out.println("Updated Integer vlaueWapper in function: " + value);
    }

    public static void main(String[] args) {
        int num = 10;
        Integer vlaueWapper=100;
        System.out.println("Before Update: " + num);
        updateInteger(num);
        System.out.println("After Update: " + num);

        updateIntegerWapper(vlaueWapper);
        System.out.println("After Update vlaueWapper: " + vlaueWapper);

    }
}
