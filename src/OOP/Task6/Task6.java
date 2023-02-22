package OOP.Task6;

public class Task6 {
    public static void main(String[] args) {
        Movable p1 = new MovablePoint(10,10,3,3);
        Movable p2 = new MovableCircle(30,10,4,9,2);

        p1.moveUp();
        p1.moveLeft();
        p2.moveDown();
        p2.moveRight();

        System.out.println(p1);
        System.out.println(p2);
    }
}
