package workshop13.com.shape;

public class Circle extends Shape implements Movable {
    private int radius;

    public Circle() {
    }

    public Circle(int radius, int x, int y) {
        super(new Point(x, y));
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public double getCircumference() {
        return this.radius * 2 * Math.PI;
    }

    @Override
    public void move(int x, int y) {
        x = super.point.getX() + x + 1;
        y = super.point.getY() + y + 1;
        super.setPoint(new Point(x, y));
    }

    @Override
    public String toString() {
        return "Circle\t\t"
                + this.radius + "\t\t"
                + super.getPoint().getX() + "\t\t"
                + super.getPoint().getY() + "\t\t\t"
                + Math.round(getArea()) + "\t\t\t"
                + Math.round(getCircumference());
    }
}
