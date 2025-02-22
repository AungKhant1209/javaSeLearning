package Day20;
import Day20.Service.BookService;

public class MainClass {
        private static BookService bookService;
        public static void main(String[] args) {
            bookService.bookRegister();
            bookService.display();
        }


}
