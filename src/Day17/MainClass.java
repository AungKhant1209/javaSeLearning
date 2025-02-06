package Day17;

import Day17.Model.Bird;
import Day17.Service.BirdService;
import Day17.Service.FishService;
import Day17.Service.TigerService;

import java.text.ParseException;
import java.util.Scanner;


public class MainClass {
    public static Scanner scanner = new Scanner(System.in);
    private BirdService birdService;
    private FishService fishService;
    private TigerService tigerService;
    public MainClass(){
        this.birdService = new BirdService();
        this.fishService= new FishService();
        this.tigerService= new TigerService();


    }
//    public class MainApp {
//        private StudentService studentService;
//        private TeacherService teacherService;
//        public MainApp() {
//            this.studentService = new StudentService();
//            this.teacherService = new TeacherService();
//        }


    public static void main(String[] args) throws ParseException {
        MainClass mainClass = new MainClass();
        String master=null;
        do{
            System.out.println("Choose the service system:");
            System.out.println("1 for bird service:\n 2 for fish service: \n 3 for tiger service: \n 4 for exit:");
            master = scanner.nextLine();
            switch (master){
                case "1":
                    mainClass.birdService.birdServiceManagement();
                    break;
                case"2":
                    mainClass.fishService.fishServiceManagement();
                    break;
                case "3":
                    mainClass.tigerService.tigerServiceManagement();
                    break;
                case"4":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Option...!!!");
                    break;



            }
        }while(!master.equals("4"));
//        public static void main(String[] args) {
//            String master=null;
//            do{
//                MainApp mainApp = new MainApp();
//                System.out.println("Welcome to School Management System");
//                System.out.println("1. Student Management " );
//                System.out.println("2. Teacher Management " );
//                System.out.println("3. Exit " );
//                master=DataUtail.scanner.nextLine();
//                switch (master) {
//                    case "1":
//                        mainApp.studentService.studentManagement();
//                        break;
//                    case "2":
//                        mainApp.teacherService.teacherManagement();
//                        break;
//                    case "3":
//                        System.out.println("Exiting...");
//                        break;
//                    default:
//                        System.out.println("Invalid Option...!!!");
//                        break;
//                }
//            }while(!master.equals("3"));
//
//
//
//
//        }


//        mainClass.birdService.registerBirds();
//        mainClass.birdService.displayBirdList();



    }
}
