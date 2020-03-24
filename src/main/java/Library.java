import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookCollection;
    private Integer capacity;

    public Library(Integer capacity){
        this.bookCollection = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int bookCount(){
        return this.bookCollection.size();
    }
}
