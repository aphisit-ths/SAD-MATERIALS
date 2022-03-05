import java.util.List;
public class BookReader implements ReaderServiceInterface {
    public static void main(String[] args) {
        Book book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        ReaderServiceInterface.printToScreen(book);;
    }
}
