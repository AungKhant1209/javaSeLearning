package Day18;

public class Fibonancci {
    public static int fibonancci(int num){
        if (num==0) {
            return 0;
        }else if(num==1){
            return 1;
        }else{
            return fibonancci(num-1)+fibonancci(num-2);
        }
    }
    public static void main(String[]args){
        System.out.println("Fibonancci of 4 is "+fibonancci(2));
    }
}
//1,2,4,8,16,17,9,18,19,5,10,20,11,3,6,12,13,7,14,15
//