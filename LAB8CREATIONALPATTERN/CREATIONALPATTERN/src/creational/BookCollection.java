package creational;
// DO NOT MODIFY ************************************************************
import java.util.HashSet;
import java.util.Set;

public abstract class BookCollection {
    protected Set<Book> books;

    public BookCollection() {
        books = new HashSet<>();
    }

    public void add(Book b) {
        books.add(b);
        System.out.println();
    }

    public void remove(Book b) {
        books.remove(b);
    }
}
