package OOP.Task2;

public class Task2 {
    public static void main(String[] args) {
        Person student = new Student("Miki","Tartu","stationary",3,2500);
        System.out.println(student);
        Person lecturer = new Lecturer("Saimon","Tartu","History of middle ages",4500);
        System.out.println(lecturer);
    }
}
