import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void setUp(){
        library = new Library(10);
        book = new Book("Absolute Power", "David Baldacci", "Crime Thriller");
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void cannotAddBookLimitReached(){
        Library libraryFull = new Library(1);
        libraryFull.addBook(book);
        libraryFull.addBook(book);
        assertEquals(1, libraryFull.bookCount());
    }

}
