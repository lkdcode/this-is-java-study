package workshop8.com.car;

public class Car {
    private String name;
    private String engine;
    private int oilTank;
    private int oilSize;
    private int distance;

    public Car(String name, String engine, int oilTank, int oilSize, int distance) {
        this.name = name;
        this.engine = engine;
        this.oilTank = oilTank;
        this.oilSize = oilSize;
        this.distance = distance;
    }

    public void go(int distance) {
        this.distance = distance;
    }

    public void setOilSize(int oilSize) {
        this.oilSize -= oilSize;
    }

    public void setOil(int oilSize) {
        this.oilSize += oilSize;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return this.name + "\t\t\t\t" + this.engine + "\t\t\t" + this.oilTank + "\t\t\t" + this.oilSize + "\t\t\t" + this.distance;
    }
}
