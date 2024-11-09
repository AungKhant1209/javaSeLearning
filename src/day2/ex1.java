package day2;

public class ex1 {
    public static void main(String[] args) {
        System.out.println("While Loop");
        int x=1;
//In am restin for fgit
        while (x<11){
            int result=2*x;
            System.out.println("2 x "+x+" = "+result);
            x++;
        }
        System.out.println("For Loop");
        for(int i=0; i<11; i++){
            int result=2*i;
            System.out.println("2 x "+i+" = "+result);
        }
        System.out.println("Factorial While Loop");
        int f=1;
        int result=1;

        while (f<11){


            result=f*result;
            System.out.println(f+"!");
            System.out.println( result);
            f++;

        }
        System.out.println("Factorial For Loop");
        int resultfor=1;
        String output="";
        for(int i=1; i<11; i++){
            resultfor=i*resultfor;
            output+=i+" x ";
            System.out.println(i+"*"+resultfor);
            System.out.println( resultfor);

        }
        System.out.println( output+" = "+resultfor);



    }
}
