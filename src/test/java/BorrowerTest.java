import org.junit.Before;
import org.junit.Test;

public class BorrowerTest {

    private Library library;
    private Book book;
    private Borrower borrower;

    @Before
    public void setUp(){
        library = new Library(10);
        book = new Book("Absolute Power", "David Baldacci", "Crime Thriller");
        borrower = new Borrower("Lyndsey");
    }

    @Test
    public void cantakeBookFromLibrary(){

    }
}
