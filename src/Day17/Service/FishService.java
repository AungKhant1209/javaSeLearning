package Day17.Service;


import Day17.Model.Fish;

import java.util.Scanner;

public class FishService {
    private static int totalFish=0;
    public static final int max_fish = 10000;
    public static Fish[] fishy = new Fish[max_fish];
    public static Scanner scanner = new Scanner(System.in);
    public void fishServiceManagement(){
        boolean flag = true;
        do{
            System.out.println("Choose type of service for fish:");
            System.out.println("1 for registeration:");
            System.out.println("2 for display:");
            System.out.println("3 for back to the menu:");
            String choice=scanner.nextLine();
            switch(choice){
                case "1":
                    registerFish();
                    break;
                case "2":
                    displayFishList();
                    break;
                case "3":
                    System.out.println("This is menu------>");
                    flag=false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

        }while(flag);
    }

    public static Fish getInformation(){
        System.out.println("enter Fish's name:");
        String name = scanner.nextLine();
        System.out.println("enter Fish's age:");
        int age = scanner.nextInt();scanner.nextLine();
        System.out.println("enter Fish's species:");
        String species = scanner.nextLine();
        System.out.println("enter Fish's color:");
        String color = scanner.nextLine();
        System.out.println("enter Fish's sex:");
        String sex = scanner.nextLine();
        Fish fish=new Fish(name,age,sex,color);
        return fish;
    }

    public static void registerFish(){
        String choice="";
        do{
            Fish fish=getInformation();
            fishy[totalFish]=fish;
            totalFish++;
            System.out.print("Do you want to continue yes/no:");
            choice=scanner.nextLine();
        }while(choice.equals("yes"));

    }
//    System.out.println("!!....Display All Teachers....!! ");
//        for (int i = 0; i < Teacher.getTotalTeacherCount(); i++) {
//        Teacher teacher = Teacher.getTeachers()[i];
//        System.out.println(teacher);
//    }


    public static void displayFishList(){
        for (int i=0; i< totalFish;i++){
            Fish fish=fishy[i];
            System.out.println(fish.getName());
            System.out.println(fish.getColor());
            System.out.println(fish.getName());
        }

    }
}
