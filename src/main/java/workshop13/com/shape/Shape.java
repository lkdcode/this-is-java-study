package workshop13.com.shape;

public abstract class Shape {
    protected Point point;

    public Shape() {
    }

    public Shape(Point point) {
        this.point = point;
    }

    public double getArea() {
        // 도형의 넓이
        return this.point.getX() + this.point.getY();
    }

    public double getCircumference() {
        // 도형의 둘레
        return 0;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}
