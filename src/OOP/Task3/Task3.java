package OOP.Task3;

public class Task3 {
    public static void main(String[] args) {
        Shape shape = new Shape("pink",false);
        System.out.println(shape);
        Circle circle = new Circle("violet",true,4);
        System.out.println(circle);
        Rectangle rectangle = new Rectangle("Blue",true,4,7);
        System.out.println(rectangle);
        Square square = new Square("green",false,4);
        System.out.println(square);
    }
}
