package Generics;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        Library<Book> bookLibrary = new Library<>(new Book[]{new Book("Lord of the Rings", "J.R.R.Tolkien")});
        System.out.println(Arrays.toString(bookLibrary.getElements()));
        Library<Newspaper> newspaperLibrary = new Library<>(new Newspaper[]{new Newspaper("Postimees","Priit " +
                "Hobemagi")});
        System.out.println(Arrays.toString(newspaperLibrary.getElements()));
        Library<Movie> movieLibrary =  new Library<>(new Movie[]{new Movie("The Pirates of the Caribbean","Gore " +
                "Verbinski")});
        System.out.println(Arrays.toString(movieLibrary.getElements()));
    }

}
