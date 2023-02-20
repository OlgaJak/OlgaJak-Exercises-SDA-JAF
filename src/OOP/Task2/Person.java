package OOP.Task2;

public class Person {
    private String name;
    private String address;

    public Person(){
    }

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getPerson() {
        return name;
    }

    public void setPerson(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return String.format("%s->%s",name,address);
    }
}
