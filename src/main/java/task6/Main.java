package task6;

public class Main {
    public static void main(String[] args) {
        BookRepository books = new BookRepository();

        Book book1 = new Book(1,"head first", "Tina", "2022");
        Book book2 = new Book(2,"Jumping Jacks", "Tina2", "2023");
        Book book3 = new Book(3,"hola", "Tina3", "2024");

        books.addBook(book1);
        books.addBook(book2);
        books.addBook(book3);

        books.removeBook(book3);

        try {
            books.searchBooksByName("head");
        } catch (NoBookFoundExeption e) {
            System.out.println(e.getMessage());
        }

        try {
            books.searchBookById(2);
        } catch (NoBookFoundExeption e) {
            System.out.println(e.getMessage());
        }

        try {
            books.removeBookById(2);
        } catch (NoBookFoundExeption e){
            System.out.println("removing book: " + e.getMessage());
        }

    }
}
