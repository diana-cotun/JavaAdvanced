package Task2_pg15;

import java.util.ArrayList;
import java.util.List;

public class Comparator {

    private List<Book> booksC;

    public Comparator(List<Book> booksC) {
        this.booksC = new ArrayList<>();
    }

    public List<Book> getBooksC() {
        return booksC;
    }

    public void setBooksC(List<Book> booksC) {
        this.booksC = booksC;
    }

    @Override
    public String toString() {
        return "Comparator{" +
                "booksC=" + booksC +
                '}';
    }

    java.util.Comparator<Book> bookComparatorByYear = new java.util.Comparator<Book>() {
        @Override
        public int compare(Book book1, Book book2) {
            return Integer.compare(book1.getReleaseDate().getYear(), book2.getReleaseDate().getYear());
        }
    };

    public void sortByYear() {
        booksC.sort(bookComparatorByYear);
    }


}
