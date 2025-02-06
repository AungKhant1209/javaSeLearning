package Day20;


//import Day17.Service.BirdService;
//import Day17.Service.FishService;
//import Day17.Service.TigerService;
//
//import java.util.Scanner;
//
//public class MainClass {
//    public static Scanner scanner = new Scanner(System.in);
//    private BirdService birdService;
//    private FishService fishService;
//    private TigerService tigerService;
//    public MainClass(){
//        this.birdService = new BirdService();
//        this.fishService= new FishService();
//        this.tigerService= new TigerService();
//
//
//    }

import Day20.Model.Book;
import Day20.Service.Service;

public class MainClass {
    private Book book;
    private Service service;
    public MainClass(){
        this.book=new Book();
        this.service=new Service();
    }
//    public static void main(String[] args){
//       MainClass mainClass = new MainClass();
//       mainClass.Service
//    }
}
