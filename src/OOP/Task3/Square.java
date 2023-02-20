package OOP.Task3;

public class Square extends Rectangle {
    public Square(String colour, boolean isFilled, double width, double length) {
        super(colour, isFilled, width, length);
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
