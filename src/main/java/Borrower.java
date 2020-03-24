import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> booksOnLoan;
    private String name;

    public Borrower(String name){
        this.booksOnLoan = new ArrayList<Book>();
        this.name = name;
    }


}
