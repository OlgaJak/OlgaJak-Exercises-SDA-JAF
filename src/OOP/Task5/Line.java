package OOP.Task5;

public class Line {
    private Point2D point1;
    private Point2D point2;

    public Line(Point2D start, Point2D end) {
        this.point1 = start;
        this.point2 = end;
    }


    public Line(float point1Start, float point1End, float point2Start, float point2End){
        this.point1 = new Point2D(point1Start,point1End);
        this.point2 = new Point2D(point2Start,point2End);
    }
    public Point2D getPoint1() {
        return point1;
    }

    public void setPoint1(Point2D point1) {
        this.point1 = point1;
    }

    public Point2D getPoint2() {
        return point2;
    }

    public void setPoint2(Point2D point2) {
        this.point2 = point2;
    }

    public float calculateLength(){
        return (float) Math.sqrt((Math.pow(point2.x - point1.x, 2) +
                Math.pow(point2.y - point1.y, 2)));
    }

    public Point2D centerCoordinates(){
        float xMiddle = (point1.x + point2.x) / 2;
        float yMiddle = (point1.y + point2.y) / 2;
        return new Point2D(xMiddle, yMiddle);
    }
}
