import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> booksOnLoan;
    private String name;

    public Borrower(String name){
        this.booksOnLoan = new ArrayList<Book>();
        this.name = name;
    }

    public int bookCount(){
        return this.booksOnLoan.size();
    }

    public void borrowBook(Library library){
        Book book = library.removeBook();
        this.booksOnLoan.add(book);
    }

}
