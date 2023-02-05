package workshop13.com.shape;

public class Rectangle extends Shape implements Movable {
    private int width;

    public Rectangle() {
    }

    public Rectangle(int width, int x, int y) {
        super(new Point(x, y));
        this.width = width;
    }

    public double getArea() {
        return this.width * this.width;
    }

    public double getCircumference() {
        return this.width * 4;
    }

    @Override
    public void move(int x, int y) {
        x = super.point.getX() + x + 2;
        y = super.point.getY() + y + 2;
        super.setPoint(new Point(x, y));
    }

    @Override
    public String toString() {
        return "Rectangle\t"
                + this.width + "\t\t"
                + super.getPoint().getX() + "\t\t"
                + super.getPoint().getY() + "\t\t\t"
                + Math.round(getArea()) + "\t\t\t"
                + Math.round(getCircumference());
    }
}