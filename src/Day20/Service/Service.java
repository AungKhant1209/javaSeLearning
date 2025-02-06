package Day20.Service;

import Day17.Model.Bird;
import Day20.Model.Book;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



public class Service {
    public static Book[] books=new Book[1000];
    public static int numberofBooks=0;
    public static Scanner scanner = new Scanner(System.in);



    public Service() {
    }

    public static Date convertToDate(String dateStr){
         SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
         try {
             return formatter.parse(dateStr);
         }catch(ParseException e) {
             return null;
         }
     }

    public static Date enterDateData(){
        System.out.println("Enter vehicle Date(dd/MM/yyyy): ");
        String dateStr =scanner.next();
        Date publishDateConverted =convertToDate(dateStr);
        while (publishDateConverted==null){
            System.out.println("Please Enter Valid date format");
            System.out.println("Enter vehicle Date(dd/MM/yyyy): ");
            dateStr = scanner.nextLine();
            publishDateConverted = convertToDate(dateStr);
        }
        return publishDateConverted;
    }
    public static Book getInformation(){
        System.out.println("Enter Book name:");
        String name=scanner.nextLine();
        System.out.println("Enter Author's name:");
        String author=scanner.nextLine();
        System.out.println("Enter quantity:");
        int quantity= scanner.nextInt();scanner.nextLine();
        System.out.println("Enter email:");
        String email=scanner.nextLine();
        Date date=enterDateData();
        System.out.println("Enter rent:");
        int rent=scanner.nextInt();scanner.nextLine();
        Book book=new Book(name,author,quantity,email,date,rent);
        return book;
    }

    public static void bookRegister(){
         String choice="";
         do{
             Book book=getInformation();
             books[numberofBooks]=book;
             numberofBooks++;
             System.out.print("Do you want to continue yes/no:");
             choice=scanner.nextLine();

         }while(choice.equals("yes"));


    }

//    public static void displayBirdList(){
//        for (int i=0; i< totalBirds;i++){
//            Bird bird=birds[i];
//            System.out.println(bird.getName());
//            System.out.println(bird.getColor());
//            System.out.println(bird.getSex());
//            System.out.println(bird.getSpecies());
//            System.out.println(bird.getAge());
//            SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
//            System.out.println(ft.format(bird.getBirthDate()));
//            ;
//        }
//
//    }
    public static void display(){
        for (int i=0;i<numberofBooks;i++){
            System.out.println(books[i]);
        }
    }
    public static void main(String[] args){
        bookRegister();
        display();
    }
}
