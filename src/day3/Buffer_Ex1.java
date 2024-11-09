package day3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Buffer_Ex1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter age: ");
        String ageInput=br.readLine();
        int age =Integer.parseInt(ageInput);
        if (age >= 10 && age < 20) {
            System.out.println("You are too young");
        }else if (age >= 20 && age < 30) {
            System.out.println("You are young");
        }else if (age <10) {
            System.out.println("You are a kid");
        }else if (age >30) {
            System.out.println("You are an adult");
        }


    }
}
