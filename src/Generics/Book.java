package Generics;

public class Book extends Media{
    private String author;

    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString(){
        return "Book title: " + super.getTitle() + ", authors name: " + author + ".";
    }
}
