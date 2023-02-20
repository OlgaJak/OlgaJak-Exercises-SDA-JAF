package OOP.Task2;

public class student extends Person{
    private String typeOfStudy;
    private int yearOfStudy;
    private int priceOfStudy;

    public student(String typeOfStudy, int  yearOfStudy, int priceOfStudy){
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

    public String toString(){
        return String.format("%s->%s->%s",typeOfStudy,yearOfStudy,priceOfStudy);
    }

}
