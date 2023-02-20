package OOP.Task2;

public class Student extends Person{
    private String typeOfStudy;
    private int yearOfStudy;
    private int priceOfStudy;


    public Student(String name, String address, String typeOfStudy, int  yearOfStudy, int priceOfStudy){
        super(name, address);
        this.typeOfStudy = typeOfStudy;
        this.yearOfStudy = yearOfStudy;
        this.priceOfStudy = priceOfStudy;
    }
    public String getTypeOfStudy() {
        return typeOfStudy;
    }

    public void setTypeOfStudy(String typeOfStudy) {
        this.typeOfStudy = typeOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public int getPriceOfStudy() {
        return priceOfStudy;
    }

    public void setPriceOfStudy(int priceOfStudy) {
        this.priceOfStudy = priceOfStudy;
    }


    @Override
    public String toString() {
        return "Student " + super.toString()+
                ", type of study = " + typeOfStudy + '\'' +
                ", year of study = " + yearOfStudy +
                ", price of study = " + priceOfStudy +
                ".";
    }
}
