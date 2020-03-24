import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
    public void booksOnLoanStartsEmpty(){
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void canTakeBookFromLibrary(){
        library.addBook(book);
        borrower.borrowBook(library);
        assertEquals(1, borrower.bookCount());
    }
}
