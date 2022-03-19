
public interface ReaderServiceInterface {
    static void printToScreen(Book book) {
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }
}
