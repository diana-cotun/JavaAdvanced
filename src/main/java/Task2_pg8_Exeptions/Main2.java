package Task2_pg8_Exeptions;

import Task2_pg8_Exeptions.Book;
import Task2_pg8_Exeptions.BookRepository;
import Task2_pg8_Exeptions.NoBookFoundException;

public class Main2 {
    public static void main(String[] args) {

        Book book1 = new Book(1, "Java", "Jane Doe", 2000);
        Book book2 = new Book(2, "OOP", "Batman", 2010);
        Book book3 = new Book(3, "SDA", "Batman", 2011);

        BookRepository bookRepository = new BookRepository();
        bookRepository.addBook(book1);
        bookRepository.addBook(book2);
        bookRepository.addBook(book3);

        bookRepository.printAllBooks();

        deleteBook(bookRepository, 4);
        bookRepository.printAllBooks();

        System.out.println();

        deleteBook(bookRepository, 9);
        bookRepository.printAllBooks();

        findByTitle(bookRepository, "OOP");
        findByTitle(bookRepository, "Titanic");


    }

    private static void deleteBook(BookRepository bookRepository, int id) {
        System.out.println("Deleting book with id " + id);
        try {
            bookRepository.deleteBook(id);
        } catch (NoBookFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void findByTitle(BookRepository bookRepository, String title) {
        System.out.println("Searching book by title " + title);
        try {
            System.out.println(bookRepository.getByTitle(title));
        } catch (NoBookFoundException e) {
            System.out.println(e.getMessage());
        }
    }
//    try with resources !!! incepand cu java 7
}
