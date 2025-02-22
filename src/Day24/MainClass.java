package Day24;

import Day24.Service.BookService;

public class MainClass {
    private static BookService bookService;
    public static void main(String[] args) {
        bookService.bookRegister();
        bookService.display();
    }


}
