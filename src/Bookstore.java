import java.util.ArrayList;
import java.util.List;
public class Bookstore {
    private List<Book>book;
    Bookstore(){
        book = new ArrayList<>();
    }
    Bookstore (List<Book>book){
        this.book=book;
    }
}
