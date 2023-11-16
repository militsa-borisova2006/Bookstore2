public class ComicBook extends Book {
    public String characterName;
    public ComicBook() {
        String characterName="";
    }

    public ComicBook(String title, Author author, BookType type, int numAvailable, double price, String characterName) {
        super(title, author, type, numAvailable, price);
        this.characterName = characterName;
    }

    @Override
    public double getPrice() {
        System.out.println(super.getTitle() + " is on sale 60%");
        double originalPrice = super.getPrice();
        originalPrice *= 0.6;
        return originalPrice;
    }
    public double getPrice(int percent) {
        System.out.println(super.getTitle() + " is on sale " +percent+ "%");
        double originalPrice = super.getPrice();
        double p=percent/100;
        originalPrice *= p;
        return originalPrice;
    }
}
