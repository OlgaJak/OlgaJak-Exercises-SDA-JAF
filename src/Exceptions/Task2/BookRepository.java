package Exceptions.Task2;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private List<Book> books = new ArrayList<>();

    public void add(Book book) {
       this.books.add(book);
    }


    public void removeBook(Book book) {
        books.remove(book);
    }
public void removeBookById(int id) throws NoBookFoundException {
        Book bookToRemove = findBookById(id);
        removeBook(bookToRemove);
    }

    public Book findBookById(int id) throws NoBookFoundException {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        throw new NoBookFoundException("No book found with ID " + id);
    }

    public List<Book> findBooksByTitle(String title) throws NoBookFoundException {
        List<Book> matchingBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                matchingBooks.add(book);
            }
        }
        if (matchingBooks.isEmpty()) {
            throw new NoBookFoundException("No books found with title " + title);
        }
        return matchingBooks;
    }


}

