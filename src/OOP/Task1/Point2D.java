package OOP.Task1;

import java.lang.reflect.Array;

public class Point2D {
    public float x;
    public float y;

    public Point2D() {

    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY(){
        return new float[]{x,y};
    }

    public void setXY(float x,float y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return String.format("(%f, %f)", x,y);
    }
}
