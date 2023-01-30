package workshop8.com.car;

public class L3 extends Car implements Temp {

    public L3(String name, String engine, int oilTank, int oilSize, int distance) {
        super(name, engine, oilTank, oilSize, distance);
    }

    @Override
    public void go(int distance) {
        super.go(distance);
        distance /= 10;
        super.setOilSize(distance);
    }

    @Override
    public void setOil(int oilSize) {
        super.setOil(oilSize);
    }

    @Override
    public int getTempGage() {
        int distance = super.getDistance();
        return distance / 10;
    }

    @Override
    public String toString() {
        return super.toString() + "\t\t\t\t" + getTempGage();
    }
}
