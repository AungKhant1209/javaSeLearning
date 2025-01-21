package Day17.Service;


import Day17.Model.Tiger;

import java.util.Scanner;

public class TigerService {
    public static void main(String[] args){
        System.out.println("Welcome to Tiger Registration:");
        System.out.println("Choose your option: ");
        System.out.println( "1. Bird Registration \n" +
                "2. Fish Registration \n" +
                "3. Tiger Registration"
                );
    }


    private static int totalTiger=0;
    public static final int max_Tiger = 10000;
    public static Tiger[] tigers = new Tiger[max_Tiger];
    public static Scanner scanner = new Scanner(System.in);

    public void tigerServiceManagement(){
        boolean flag = true;
        do{
            System.out.println("Choose type of service for tiger:");
            System.out.println("1 for registeration:");
            System.out.println("2 for display:");
            System.out.println("3 for back to the menu:");
            String choice=scanner.nextLine();
            switch(choice){
                case "1":
                    registerTiger();
                    break;
                case "2":
                    displayTigerList();
                    break;
                case "3":
                    System.out.println("This is menu------>");
                    flag=false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }

        }while(flag);
    }





    public static Tiger getInformation(){
        System.out.println("enter Tiger's name:");
        String name = scanner.nextLine();
        System.out.println("enter Tiger's age:");
        int age = scanner.nextInt();scanner.nextLine();
        System.out.println("enter Tiger's species:");
        String species = scanner.nextLine();
        System.out.println("enter Tiger's color:");
        String color = scanner.nextLine();
        System.out.println("enter Tiger's sex:");
        String sex = scanner.nextLine();
        Tiger tiger=new Tiger(name,age,sex,color);
        return tiger;
    }

    public static void registerTiger(){
        String choice="";
        do{
            Tiger tiger=getInformation();
            tigers[totalTiger]=tiger;
            totalTiger++;
            System.out.print("Do you want to continue yes/no:");
            choice=scanner.nextLine();
        }while(choice.equals("yes"));

    }
//    System.out.println("!!....Display All Teachers....!! ");
//        for (int i = 0; i < Teacher.getTotalTeacherCount(); i++) {
//        Teacher teacher = Teacher.getTeachers()[i];
//        System.out.println(teacher);
//    }


    public static void displayTigerList(){
        for (int i=0; i< totalTiger;i++){
            Tiger tiger=tigers[i];
            System.out.println(tiger.getName());
            System.out.println(tiger.getColor());
            System.out.println(tiger.getName());
        }

    }
}
