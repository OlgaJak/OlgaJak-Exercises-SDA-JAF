package OOP.Task3;

public class Shape {
    private String colour;
    private boolean isFilled;

    public Shape(){
        this.colour = "unknown";
        this.isFilled = false;
    }


    public Shape(String colour, boolean isFilled){
        this.colour = colour;
        this.isFilled = isFilled;
    }
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    @Override  //????????
    public String toString() {
        return String.format("Shape with colour of %s and %s",colour,isFilled ? "filled" : "NotFilled");
    }

}
