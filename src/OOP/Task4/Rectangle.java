package OOP.Task4;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        setColour("Unknown");
        setFilled(false);
        setWidth(1);
        setLength(1);
    }

    @Override
    public double getArea() {
        return (length * width);
    }

    @Override
    public double getPerimeter() {
        return (2 * length + 2 * width);
    }

    public Rectangle(String colour, boolean isFilled, double width, double length) {
        super(colour, isFilled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

//    public double getArea() {
//        return (length * width);
//    }
//
//    public double getPerimeter() {
//        return (2 * length + 2 * width);
//    }

    public String toString() {
        return String.format("Rectangle with width= %f and length= %f which is a subclass of %s",width,length,
                super.toString());
    }

}
