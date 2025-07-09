class Library {
    class Book {
        void display() {
            System.out.println("Book");
        }
    }
}
public class Library1{
    public static void main(String[] args) {
        Library l= new Library();
        Library.Book book = l.new Book();
        book.display();
    }
}