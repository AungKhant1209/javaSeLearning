package Day24.Service;


import Day24.Model.Book;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class BookService {
    public static List<Book> books = new ArrayList<>();
    public static Scanner scanner= new Scanner(System.in);
    public static Date enterDateData(){
        System.out.println("Enter vehicle Date(dd/MM/yyyy): ");
        String dateStr =scanner.nextLine();
        Date publishDateConverted =convertToDate(dateStr);
        while (publishDateConverted==null){
            System.out.println("Please Enter Valid date format");
            System.out.println("Enter vehicle Date(dd/MM/yyyy): ");
            dateStr = scanner.nextLine();
            publishDateConverted = convertToDate(dateStr);
        }
        return publishDateConverted;
    }
    //    public String getNameInput() {
//        while (true) {
//            try {
//                System.out.print("Enter Name of Book: ");
//                String name = scanner.nextLine();
//                if (name.isEmpty())
//                    throw new RuntimeException("Book name cannot be empty.");
//                return name;
//            } catch (RuntimeException e) {
//                System.out.println("Error!!!! " + e.getMessage());
//            }
//        }
//    }
//} catch (NumberFormatException e) {
////                System.out.println("Error: Invalid number format. Please enter a valid integer.");
/// /    public int getQuantityInput() {
/// //        while (true) {
/// //            try {
/// //                System.out.print("Enter Quantity: ");
/// //                int quantity = Integer.parseInt(scanner.nextLine());
/// //                if (quantity < 0)
/// //                    throw new RuntimeException("Quantity must be greater than zero.");
/// //                return quantity;
/// //            } catch (NumberFormatException e) {
/// //                System.out.println("Error: Invalid number format. Please enter a valid integer.");
/// //            } catch (RuntimeException e) {
/// //                System.out.println("Error!!!!" + e.getMessage());
/// //            }
/// //        }
/// //    }
    public static int quantityError(){
        int quantity=0;


        while(quantity==0){
            try{
                System.out.println("Enter quantity:");
                quantity= scanner.nextInt();

                return quantity;

            }catch(InputMismatchException e){
                System.out.println("Please just enter only number:" );
                quantity=0;
                System.out.println("Enter quantity:");
                quantity= scanner.nextInt();

            }
        }
        return quantity;

    }

    public static Date convertToDate(String dateStr){
        SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
        try {
            return formatter.parse(dateStr);
        }catch(ParseException e) {
            return null;
        }
    }

    public static Book getInformation(){
        System.out.println("Enter Book name:");
        String name=scanner.nextLine();
        System.out.println("Enter Author's name:");
        String author=scanner.nextLine();
        int quantity= quantityError();
        scanner.nextLine();
        System.out.println("Enter email:");
        String email=scanner.nextLine();
        Date date=enterDateData();
        System.out.println("Enter rent fees:");
        int rent=scanner.nextInt();scanner.nextLine();
        Book book=new Book(name,author,quantity,email,date,rent);
        return book;
    }
    public static void bookRegister(){
        String choice="";
        do{
            Book book=getInformation();
            books.add(book);
            System.out.print("Do you want to continue yes/no:");
            choice=scanner.nextLine();

        }while(choice.equals("yes"));
    }
    public static void display(){
        for (Book bookofBooks:books){
            System.out.println(bookofBooks);
        }
    }



}

/////
//package Day20.BookSystem;
//
//import Day20.Model.BookManagement;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Scanner;
//
//public class BookService {
//    private static final int MAX_BOOKS = 1000;
//    private BookManagement[] books = new BookManagement[MAX_BOOKS];
//    private int totalbookCount = 0;
//    private Scanner scanner = new Scanner(System.in);
//
//    public void registerBook() {
//        if (totalbookCount >= MAX_BOOKS) {
//            System.out.println("Library is full. Cannot register more books.");
//            return;
//        }
//
//        int bookId = totalbookCount + 1;
//        String name = getNameInput();
//        String author = getAuthorInput();
//        int quantity = getQuantityInput();
//        String publisherEmail = getPublisherEmailInput();
//        Date publishDate = getPublisherDateInput();
//        double rentFee = getRentFeeInput();
//
//        books[totalbookCount] = new BookManagement(bookId, name, author, quantity, publisherEmail, publishDate, rentFee);
//        totalbookCount++;
//        System.out.println("Book registered successfully!");
//    }
//
//    public String getNameInput() {
//        while (true) {
//            try {
//                System.out.print("Enter Name of Book: ");
//                String name = scanner.nextLine();
//                if (name.isEmpty())
//                    throw new RuntimeException("Book name cannot be empty.");
//                return name;
//            } catch (RuntimeException e) {
//                System.out.println("Error!!!! " + e.getMessage());
//            }
//        }
//    }
//
//    public String getAuthorInput() {
//        while (true) {
//            try {
//                System.out.print("Enter Author of Book: ");
//                String author = scanner.nextLine();
//                if (author.isEmpty())
//                    throw new RuntimeException("Author name cannot be empty.");
//                return author;
//            } catch (RuntimeException e) {
//                System.out.println("Error!!!!" + e.getMessage());
//            }
//        }
//    }
//
//    public int getQuantityInput() {
//        while (true) {
//            try {
//                System.out.print("Enter Quantity: ");
//                int quantity = Integer.parseInt(scanner.nextLine());
//                if (quantity < 0)
//                    throw new RuntimeException("Quantity must be greater than zero.");
//                return quantity;
//            } catch (NumberFormatException e) {
//                System.out.println("Error: Invalid number format. Please enter a valid integer.");
//            } catch (RuntimeException e) {
//                System.out.println("Error!!!!" + e.getMessage());
//            }
//        }
//    }
//
//    public String getPublisherEmailInput() {
//        while (true) {
//            try {
//                System.out.print("Enter Publisher Email: ");
//                String email = scanner.nextLine();
//                if (!email.endsWith("@gmail.com"))
//                    throw new RuntimeException("Invalid email format! Publisher email must end with @gmail.com.");
//                return email;
//            } catch (RuntimeException e) {
//                System.out.println("Error!!!!" + e.getMessage());
//            }
//        }
//    }
//
//    public Date getPublisherDateInput() {
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        while (true) {
//            try {
//                System.out.print("Enter Publisher Date (dd/MM/yyyy): ");
//                String date = scanner.nextLine();
//                return sdf.parse(date);
//            } catch (ParseException e) {
//                System.out.println("Error: Invalid date format. Please use dd/MM/yyyy.");
//            }
//        }
//    }
//
//    public double getRentFeeInput() {
//        while (true) {
//            try {
//                System.out.print("Enter Rent Fee: ");
//                double rentFee = Double.parseDouble(scanner.nextLine());
//                if (rentFee < 0)
//                    throw new RuntimeException("Rent fee cannot be negative.");
//                return rentFee;
//            } catch (NumberFormatException e) {
//                System.out.println("Error occur !!!!-----Invalid number format. Please enter a valid  number.");
//            } catch (RuntimeException e) {
//                System.out.println("Error occur !!!!" + e.getMessage());
//            }
//        }
//    }
//
//
//    public void displayAllBooks() {
//        if (totalbookCount == 0) {
//            System.out.println("No books available in the library.");
//            return;
//        }
//        for (int i = 0; i < totalbookCount; i++) {
//            System.out.println(books[i].toString());
//        }
//    }
//
//    public void findBookByName() {
//        System.out.print("Enter Name of Book: ");
//        String name = scanner.nextLine();
//
//        for (int i = 0; i < totalbookCount; i++) {
//            BookManagement book = books[i];
//            if (book.getName().equalsIgnoreCase(name)) {
//                System.out.println(book.toString());
//                return;
//            }
//        }
//        System.out.println("No book found with that name.");
//    }
//
//    public void findBookById() {
//        System.out.print("Enter ID of Book: ");
//        int bookId = Integer.parseInt(scanner.nextLine());
//
//        for (int i = 0; i < totalbookCount; i++) {
//            BookManagement book = books[i];
//            if (book.getBookId() == bookId) {
//                System.out.println(book.toString());
//                return;
//            }
//        }
//
//        System.out.println("No book found with that ID.");
//    }
//}