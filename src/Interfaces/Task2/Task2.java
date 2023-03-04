package Interfaces.Task2;

public class Task2 {
    public static void main(String[] args) {
        Movie movie = new Movie.MovieCreator()
                .setTitle("The Matrix")
                .setDirector("Lana Wachowski")
                .setGenre("science fiction")
                .setYearOfRelease(1999)
                .setDistributor("Warner Bros.")
                .createMovie();
        System.out.println(movie);

    }
}
