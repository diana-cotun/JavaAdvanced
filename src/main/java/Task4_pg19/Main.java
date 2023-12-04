package Task4_pg19;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Java", LocalDate.of(2000, 5, 20), "SDA", 200);
        Book book2 = new Book("Java2", LocalDate.now(), "SDA", 200);
        Book book3 = new Book("OCA", LocalDate.now(), "Author OCA", 400);
        System.out.println("Books Library");

        MediaLibrary<Book> bookMediaLibrary = new MediaLibrary<>();

        bookMediaLibrary.addMedia(book1);
        bookMediaLibrary.addMedia(book2);
        bookMediaLibrary.addMedia(book3);

        bookMediaLibrary.printMedias();

        System.out.println("Initial book library total price is:  " + bookMediaLibrary.getTotalPrice());

        bookMediaLibrary.removeMedia(book1);

        bookMediaLibrary.printMedias();
        System.out.println("Book library total price after sale is: " + bookMediaLibrary.getTotalPrice());

        Movie movie1 = new Movie("Titanic", LocalDate.of(1990, 1, 20), "Director Titanic", 500);
        Movie movie2 = new Movie("Titanic2", LocalDate.of(2000, 1, 20), "Director Titanic", 600);
        Movie movie3 = new Movie("Titanic3", LocalDate.of(2010, 1, 20), "Director Titanic", 100);
        Movie movie4 = new Movie("Titanic4", LocalDate.of(2020, 1, 20), "Director Titanic", 200);
        System.out.println("\n Movie Library");

        MediaLibrary<Movie> movieMediaLibrary = new MediaLibrary<>();
        movieMediaLibrary.addMedia(movie1);
        movieMediaLibrary.addMedia(movie2);
        movieMediaLibrary.addMedia(movie3);
        movieMediaLibrary.addMedia(movie4);
        movieMediaLibrary.printMedias();
        System.out.println("Initial movie library total price is: " + movieMediaLibrary.getTotalPrice());
        movieMediaLibrary.removeMedia(movie1);
        movieMediaLibrary.removeMedia(movie2);
        movieMediaLibrary.printMedias();
        System.out.println("Movie library total price after sale is: " + movieMediaLibrary.getTotalPrice());





    }
}
