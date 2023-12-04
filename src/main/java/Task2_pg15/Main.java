package Task2_pg15;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Emil", "Emilut", Gender.MALE);
        Author author2 = new Author("Dumitru", "Ana", Gender.FEMALE);
        Author author3 = new Author("Dorin", "Chez", Gender.MALE);
        Author author4 = new Author("Delia", "Ionescu", Gender.FEMALE);

        //list.of -> lista immutable (nu o putem modifica)-> nu putem face add, remove -> crapa
        Book book1 = new Book("Colt Alb", 55, LocalDate.of(1999, 5, 21), List.of(author1, author4), Genre.ACTION);
        Book book2 = new Book("OCA", 270, LocalDate.of(2004, 11, 1), List.of(author1, author2, author4), Genre.SF);
        Book book3 = new Book("Java", 420, LocalDate.of(2012, 1, 28), List.of(author1), Genre.ANIME);
        Book book4 = new Book("Titanic", 15, LocalDate.of(1981, 6, 18), List.of(author3, author4), Genre.COMEDY);

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        BookService bookService = new BookService(books);

        System.out.println("All books are: " );
        bookService.printAllBooks();

        System.out.println("All books with genre are: " );
        System.out.println(bookService.getBookByGenre(Genre.ACTION));

        System.out.println("All books before 2000: " );
        System.out.println(bookService.getBooksBeforYearOfRelease(1950));

        System.out.println("The most expensive book is: " );
        System.out.println(bookService.getMostExpensiveBook());

        System.out.println("The most cheapest book is: " );
        System.out.println(bookService.getMostCheapestBook());

        System.out.println("Get book by author: " );
        System.out.println(bookService.getBooksByAuthor(author1));

        System.out.println("Authors list is:");
        System.out.println(bookService.getAuthors());

        System.out.println("Book written by 3 authors:");
        System.out.println(bookService.getBookWith3Authors());

        System.out.println("Book sorted by price:");
        bookService.getStackSortedByPrice();

        System.out.println("Book sorted by year:");
        Comparator comparator = new Comparator(books);
        comparator.sortByYear();
        System.out.println(books);




    }
}
