public class Book {
    private String title;
    private Author author=new Author();
    private BookType type;
    private int available;
    private double price;

    public Book() {
    }

    public Book(String title, Author author, BookType type, int numAvailable, double price) {
        this.title = title;
        this.author = author;
        this.type = BookType.BOOK;
        this.available = numAvailable;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", type=" + type +
                ", available=" + available +
                ", price=" + price +
                '}';
    }

    public double getPrice(){
        return price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public BookType getType() {
        return type;
    }

    public void setType(BookType type) {
        this.type = type;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
