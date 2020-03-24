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

    public boolean hasSpace(){
       if(this.capacity > bookCount()){
           return true;
       } else {
           return false;
       }
    }

    public void addBook(Book bookToAdd){
        if(hasSpace()) {
            this.bookCollection.add(bookToAdd);
        }
    }

    public Book removeBook() {
        return this.bookCollection.remove(0);
    }
}
