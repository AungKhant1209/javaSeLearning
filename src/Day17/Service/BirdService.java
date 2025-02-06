package Day17.Service;

import Day17.Model.Bird;
import Day9.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BirdService {
    private static int totalBirds=0;
    public static final int max_birds = 10000;
    public static Bird[] birds = new Bird[max_birds];
    public static Scanner scanner = new Scanner(System.in);

    public void birdServiceManagement() throws ParseException {
        boolean flag = true;
        do{
            System.out.println("Choose type of service for bird:");
            System.out.println("1 for registeration:");
            System.out.println("2 for display:");
            System.out.println("3 for deleting bird:");
            System.out.println("4 for updating bird:");
            System.out.println("5 for back:");
            String choice=scanner.nextLine();
            switch(choice){
                case "1":
                    registerBirds();
                    break;
                case "2":
                    displayBirdList();
                    break;
                case "3":
                    birdDelete();
                    break;
                case "4":
                    birdsUpdate();
                    break;
                case "5":
                    System.out.println("This is menu------>");
                    flag=false;
                    break;
                default:
                   System.out.println("Invalid option. Please try again.");
                   break;
            }

        }while(flag);
    }


        public static Bird getInformation() throws ParseException {
        System.out.println("enter Bird's name:");
        String name = scanner.nextLine();
        System.out.println("enter Bird's date (dd/mm/yyyy):");
        String dobString = scanner.nextLine();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Date dob=simpleDateFormat.parse(dobString);
        System.out.println("enter Bird's species:");
        String species = scanner.nextLine();
        System.out.println("enter Bird's color:");
        String color = scanner.nextLine();
        System.out.println("enter Bird's sex:");
        String sex = scanner.nextLine();
        int age=ageCalculator(dob);
        System.out.println("age=="+age);
        Bird bird=new Bird(name,dob,sex,color,age);

        return bird;
    }

    public static void registerBirds() throws ParseException {
        String choice="";
        do{
            Bird bird=getInformation();
            birds[totalBirds]=bird;
            totalBirds++;
            System.out.print("Do you want to continue yes/no:");
            choice=scanner.nextLine();
        }while(choice.equals("yes"));

    }



    public static void displayBirdList(){
        for (int i=0; i< totalBirds;i++){
            Bird bird=birds[i];
            System.out.println(bird.getName());
            System.out.println(bird.getColor());
            System.out.println(bird.getSex());
            System.out.println(bird.getSpecies());
            System.out.println(bird.getAge());
            SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
            System.out.println(ft.format(bird.getBirthDate()));
            ;
        }

    }
    public static int searchBird(String animalName) {
        for (int i = 0; i < birds.length; i++) {
            if (birds[i].getName().equals(animalName)) {
                return i;
            }

        }
        return -1;
    }
    public static int ageCalculator(Date dob){
        Date currentDate=new Date();
        int ageYear= (int) (((currentDate.getTime()-dob.getTime())/(1000*60*60*24))/365);
        return ageYear;
    }
    public static void deleteProcess(int deleteIndex){
        while(birds[deleteIndex+1]!=null){
            birds[deleteIndex]=birds[deleteIndex+1];
            deleteIndex++;
        }
        birds[deleteIndex]=null;
        totalBirds--;
    }
    public static void birdsUpdate() throws ParseException {
        System.out.println("Insert the name of the bird: ");
        String searchName = scanner.nextLine();
        int indexUpdate=searchBird(searchName);
        Bird bird = getInformation();
        birds[indexUpdate] = bird;
    }
    public static void birdDelete(){
        System.out.println("Delete the bird: ");
        String deleteName= scanner.nextLine();
        int indexUpdate = searchBird(deleteName);
        deleteProcess(indexUpdate);
    }
    //public static void studentDelete() {
//    System.out.println("Delete the student: ");
//    String deleteName = scanner.nextLine();
//    int indexUpdate = searchStudent(deleteName);
//    deleteProcess(indexUpdate);
//}

}
//public static void studentUpdate() {
//    System.out.println("Insert the name of the student: ");
//    String searchName = scanner.nextLine();
//
//    int indexUpdate=searchStudent(searchName);
//    Student student = getInformation();
//    students[indexUpdate] = student;
//}
//public static void deleteProcess(int deleteIndex) {
//    while(students[deleteIndex+1] != null) {
//        students[deleteIndex]=students[deleteIndex+1];
//        deleteIndex++;
//    }
//    students[deleteIndex]=null;
//    index--;
//
//}
//public static void studentDelete() {
//    System.out.println("Delete the student: ");
//    String deleteName = scanner.nextLine();
//    int indexUpdate = searchStudent(deleteName);
//    deleteProcess(indexUpdate);
//}
//public static int searchStudent(String searchName) {
//    for (int i = 0; i < index; i++) {
//        if (students[i].getName().equals(searchName)) {
//            return i;
//        }
//    }
//    return -1;
//}