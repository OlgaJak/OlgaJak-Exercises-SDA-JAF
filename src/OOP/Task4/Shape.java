package OOP.Task4;

abstract class Shape {
    private String colour;
    private boolean isFilled;

    protected Shape() {
        this.colour = "unknown";
        this.isFilled = false;
    }


    protected Shape(String colour, boolean isFilled) {
        this.colour = colour;
        this.isFilled = isFilled;
    }

    protected String getColour() {
        return colour;
    }

    protected void setColour(String colour) {
        this.colour = colour;
    }

    protected boolean isFilled() {
        return isFilled;
    }

    protected void setFilled(boolean filled) {
        isFilled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override  //????????
    public String toString() {
        return String.format("Shape with colour of %s and %s", colour, isFilled ? "filled" : "not filled");
    }



}
