package workshop13.com.shape;

public abstract class Shape {
    protected Point point;

    public Shape() {
    }

    public Shape(Point point) {
        this.point = point;
    }

    public double getArea() {
        return 0;
    }

    public double getCircumference() {
        return 0;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}
