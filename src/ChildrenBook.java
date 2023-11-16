public class ChildrenBook extends Book{
    private int age;
    public ChildrenBook(){
    int age=0;
    }
    public ChildrenBook(String title, Author author, BookType type, int numAvailable, double price, int age ){
        super(title, author, type, numAvailable, price);
        this.age=age;
    }
    @Override
    public double getPrice() {
        System.out.println(super.getTitle() + " is on sale 70%");
        double originalPrice = super.getPrice();
        originalPrice *= 0.7;
        return originalPrice;
    }
}
