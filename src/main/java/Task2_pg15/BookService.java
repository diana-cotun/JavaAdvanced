package Task2_pg15;

import java.time.LocalDate;
import java.util.*;
import java.util.Comparator;

public class BookService {

    private List<Book> books;

    public BookService(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookService{" +
                "books=" + books +
                '}';
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public void printAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public List<Book> getBookByGenre(Genre genre) {
        List<Book> booksByGenre = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre() == genre) {
                booksByGenre.add(book);
            }
        }
        return booksByGenre;
    }

    public List<Book> getBooksBeforYearOfRelease(int year) {
        List<Book> booksBeforYearOfRelease = new ArrayList<>();
        for (Book book : books) {
            if (book.getReleaseDate().getYear() <= year) {
                booksBeforYearOfRelease.add(book);
            }
        }
        return booksBeforYearOfRelease;
    }

    public Book getMostExpensiveBook() {
        Book mostExpensive = null;
        for (Book book : books) {
            if (mostExpensive == null || mostExpensive.getPrice() < book.getPrice()) {
                mostExpensive = book;
            }
        }
        return mostExpensive;
    }

    public Book getMostCheapestBook() {
        Book mostCheapestBook = null;
        for (Book book : books) {
            if (mostCheapestBook == null || book.getPrice() < mostCheapestBook.getPrice()) {
                mostCheapestBook = book;
            }
        }
        return mostCheapestBook;
    }

    public List<Book> getBooksByAuthor(Author author) {
        List<Book> booksAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthors().contains(author)) {
                booksAuthor.add(book);
            }
        }
        return booksAuthor;
    }
//    public List<Author> getAuthors () {
//        List<Author> authors = new ArrayList<>();
//        for (Book book : books) {
//            for (Author author : book.getAuthors()) {
//                if (!authors.contains(author)) {
//                    authors.add(author);
//                }
//            }
//        }
//        return authors;
//    }

    public Set<Author> getAuthors () {
        Set<Author> authors = new HashSet<>();
        for (Book book : books) {
            authors.addAll(book.getAuthors());
        }
        return authors;
    }

    public Book getBookWith3Authors () {
        Book bookFind = null;
        for (Book book : books) {
            if (book == null || book.getAuthors().size() >= 3) {
                bookFind = book;
            }
        }
        return bookFind;
    }

    Comparator<Book> bookComparatorByPrice = new Comparator<Book>() {
        @Override
        public int compare(Book book1, Book book2) {
            return Integer.compare(book1.getPrice(), book2.getPrice());
        }
    };

    public void getStackSortedByPrice() {
        books.sort(bookComparatorByPrice);
        System.out.println(books);
    }


//


}
