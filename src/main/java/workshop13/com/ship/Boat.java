package workshop13.com.ship;

public class Boat extends Ship {
    public Boat() {

    }

    public Boat(String shipName, int fuelTank) {
        super(shipName + "\t", fuelTank);
    }

    @Override
    public void sail(int dist) {
        super.sail(dist * 10);
    }

    @Override
    public String getShipName() {
        return super.getShipName();
    }

    @Override
    public void refuel(int fuelTank) {
        super.refuel(fuelTank * 10);
    }

}
