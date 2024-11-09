package day2;

public class While_Looping {
    public static void main( String[] args ) {
        int count=0;// dont know loop codition when it will end
        while( count < 10 ) {
            System.out.println( "Hello World!" );
            count++;
        }
        int count3=5; //loop body is first
        do{
            System.out.println( "Hello World do" );
            count3--;
        }while(count3>0);
    }
}
