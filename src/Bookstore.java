import java.util.ArrayList;
import java.util.List;
public class Bookstore {
    private List<Book> books;
    Bookstore(){
        List<Book> books = new ArrayList<>();
    }
    Bookstore (List<Book>book){
        this.books=book;
    }
    public void add(Book book) {
        books.add(book);
    }

    public void sell(Book book) {
        int available = book.getAvailable();
        book.setAvailable(available - 1);
        if(book.getAvailable() != 0) {
            System.out.println(book.getTitle() + " by " + book.getAuthor().getName() + " was sold at " + book.getPrice());
        }else{
            System.out.println(book.getTitle()+" out of stock.");
        }
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
