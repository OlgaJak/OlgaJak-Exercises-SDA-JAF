package Collections;

public class Author {

    //Implement the Author class which will contain fields: name, last name,gender. Please consider all available methods and
    //constructor parameters. Please prepare hashCode and equals implementation.
    private String name;
    private String lastName;
    private char gender;


    public Author(String name, String lastName, char gender) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

}
