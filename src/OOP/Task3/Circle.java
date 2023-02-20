package OOP.Task3;

public class Circle extends Shape{
    private int radiusValue;

    public Circle(){
        setColour("Unknown");
        setFilled(false);
        setRadiusValue(1);
    }
    public Circle(String colour, boolean isFilled, int radiusValue) {
        super(colour, isFilled);
        this.radiusValue = radiusValue;
    }

    public int getRadiusValue() {
        return radiusValue;
    }

    public void setRadiusValue(int radiusValue) {
        this.radiusValue = radiusValue;
    }

    public int getArea (){
        return (int) (Math.PI*radiusValue*radiusValue);
    }

    public int getPerimeter(){
        return (int)(2*Math.PI*radiusValue);
    }

    @Override
    public String toString() {
        return String.format("Circle with radius=%d which is subclass off %s", radiusValue, super.toString());
    }
}
