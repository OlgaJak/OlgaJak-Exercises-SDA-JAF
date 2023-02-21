package OOP.Task4;

public class Circle extends Shape {
    private double radiusValue;

    public Circle(){
        setColour("Unknown");
        setFilled(false);
        setRadiusValue(1);
    }

    @Override
    public double getArea() {
        return  (Math.PI*radiusValue*radiusValue);
    }

    @Override
    public double getPerimeter() {
        return (2*Math.PI*radiusValue);
    }

    public Circle(String colour, boolean isFilled, double radiusValue) {
        super(colour, isFilled);
        this.radiusValue = radiusValue;
    }

    public double getRadiusValue() {
        return radiusValue;
    }

    public void setRadiusValue(double radiusValue) {
        this.radiusValue = radiusValue;
    }

//    public double getArea (){
//        return  (Math.PI*radiusValue*radiusValue);
//    }

//    public double getPerimeter(){
//        return (2*Math.PI*radiusValue);
//    }

    @Override
    public String toString() {
        return String.format("Circle with radius= %f which is subclass off %s", radiusValue, super.toString());
    }
}
