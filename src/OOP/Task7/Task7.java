package OOP.Task7;

public class Task7 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Circle perimeter = "+ circle.getPerimeter());
        System.out.println("Circle area = " + circle.getArea());

        ResizableCircle resCir = new ResizableCircle(3.1);
        System.out.println("Resizable circle perimeter = "+resCir.getPerimeter());
        System.out.println("Resizable circle area = " + resCir.getArea());

        resCir.resize(20);
        System.out.println("Resizable circle new perimeter = "+resCir.getPerimeter());
        System.out.println("Resizable circle new area = " + resCir.getArea());
    }
}
