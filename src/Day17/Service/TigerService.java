package Day17.Service;


import Day17.Model.Bird;
import Day17.Model.Tiger;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

    public void tigerServiceManagement() throws ParseException {
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





    public static Tiger getInformation() throws ParseException {
        System.out.println("enter Tiger's name:");
        String name = scanner.nextLine();
        System.out.println("enter Tiger's date (dd/mm/yyyy):");
        String dobString = scanner.nextLine();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Date dob=simpleDateFormat.parse(dobString);
        System.out.println("enter Tiger's species:");
        String species = scanner.nextLine();
        System.out.println("enter Tiger's color:");
        String color = scanner.nextLine();
        System.out.println("enter Tiger's sex:");
        String sex = scanner.nextLine();
        int age=ageCalculator(dob);
        System.out.println("age=="+age);
        Tiger tiger=new Tiger(name,dob,sex,color,age);

        return tiger;
    }

    public static void registerTiger() throws ParseException {
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
public static int ageCalculator(Date dob){
    Date currentDate=new Date();
    int ageYear= (int) (((currentDate.getTime()-dob.getTime())/(1000*60*60*24))/365);
    return ageYear;
}


    public static void displayTigerList(){
        for (int i=0; i< totalTiger;i++){
            Tiger tiger=tigers[i];
            System.out.println(tiger.getName());
            System.out.println(tiger.getColor());
            System.out.println(tiger.getName());
        }

    }
}
