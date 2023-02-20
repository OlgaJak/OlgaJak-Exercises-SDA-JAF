package OOP.Task3;

public class Square extends Rectangle {
    public Square(String colour, boolean isFilled, double size) {
        super(colour, isFilled, size, size);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(length);

    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(width);
    }


}
