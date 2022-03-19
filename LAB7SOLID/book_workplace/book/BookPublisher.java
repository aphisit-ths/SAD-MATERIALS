
import java.util.List;

public class BookPublisher implements PublisherServiceInterface {
    public static void main(String[] args) {
        Book book2 = new Book("Tyland", List.of("I", "dont", "here", "recently", "too"));
        PublisherServiceInterface.printToFile(book2);
        String title = book2.getTitle();
        System.out.println(title);
    }
}
