package task6;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookRepository {
    private final List<Book> books = new ArrayList<>();


    public void addBook(Book book){
        books.add(book);
        System.out.println(books);
    }

    public void removeBook(Book book){
        books.remove(book);
        System.out.println(books);
    }

    public List<Book> searchBooksByName(String name) throws NoBookFoundExeption {
            List<Book> booksFound = new ArrayList<>();
            books.forEach((n) -> {
                if (n.getTitle().contains(name)){
                    booksFound.add(n);
                }
            });

            if (booksFound.isEmpty()){
                throw new NoBookFoundExeption("No books found with the name: " + name);
            }
        System.out.println("Books found: " + booksFound);
            return booksFound;

    }

    public Book searchBookById(int id) throws NoBookFoundExeption {
        Optional<Book> book = books.stream().filter(n -> n.getId() == id).findFirst();
        if (book.isEmpty()){
            throw new NoBookFoundExeption("No book found with the id");
        }
        System.out.println("Book found: " + book.get());
        return book.get();
    }

    public void removeBookById(int id) throws NoBookFoundExeption {
        Book book = searchBookById(id);
        books.remove(book);
        System.out.println("Book with the id " + id + " is removed");
        System.out.println(books);
    }



}
