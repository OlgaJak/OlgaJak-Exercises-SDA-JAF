package Exceptions.Task2;

import java.util.List;

public class Task2 {
    public static void main(String[] args) throws NoBookFoundException {
        BookRepository bookRepository = new BookRepository();
        bookRepository.add(new Book(256,"Lord of the rings","John Ronald Reuel Tolkien",1954));
        bookRepository.add(new Book(387,"The hobbit","John Ronald Reuel Tolkien", 1937));
        List<Book> book = bookRepository.findBooksByTitle("??");
        Book book1 = bookRepository.findBookById(387);


    }
}
