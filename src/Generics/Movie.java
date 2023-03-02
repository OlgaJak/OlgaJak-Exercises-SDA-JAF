package Generics;

public class Movie extends Media{
    private String directorOfTheMovie;

    public Movie(String title, String directorOfTheMovie) {
        super(title);
        this.directorOfTheMovie = directorOfTheMovie;
    }

    public String getDirectorOfTheMovie() {
        return directorOfTheMovie;
    }

    public void setDirectorOfTheMovie(String directorOfTheMovie) {
        this.directorOfTheMovie = directorOfTheMovie;
    }

    @Override
    public String toString(){
        return "The name of the movie is: " + getTitle() + ", one of the directors name: " + directorOfTheMovie + ".";
    }

}
