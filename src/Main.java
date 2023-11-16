import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    /*Когато сте въвели информация за всички книги и имате в BookStore
     попълнен списък с книги и техните наличности, от main metod-а извиквате
      метода sell() на всяка втора книга (през една) и ако има налична от
      нея я продавате, а ако няма налична показвате на стандартния изход,
      че нямате наличност от съответната книга.
Ето и помощната диаграма от час за проекта:

*/
    public static void main(String[] args) {
        Bookstore store = new Bookstore();
        Scanner sc = new Scanner(System.in);
        int numberOfBooks = sc.nextInt();

        for ( int i = 0; i < numberOfBooks; i++){
            Book book = new Book();
            System.out.println("Въведете данни за книга: <тип-Comic_book/Children_book> <заглавие> <автор> <години на автора> <брой налични> <цена>");
            BookType type = BookType.valueOf(sc.next().toUpperCase());
            switch (type) {
                case CHILDREN_BOOK:
                    book = new ChildrenBook();
                    break;
                case COMIC_BOOK:
                    book = new ComicBook();
                    break;
                default:
                    book= new Book();
                    break;
            };

            book.setType(type);
            book.setTitle(sc.next());
            Author author = new Author();
            author.setName(sc.next());
            author.setAge(sc.nextInt());
            book.setAuthor(author);
            book.setAvailable(sc.nextInt());
            book.setPrice(sc.nextDouble());
            store.add(book);
            sc.close();
        }

        for(int i=0; i<numberOfBooks; i+=2){
            store.sell(store.getBooks().get(i));
        }

        for(int i =0; i<numberOfBooks; i++){
            store.getBooks().get(i).toString();
            System.out.println();
        }
    }
}


