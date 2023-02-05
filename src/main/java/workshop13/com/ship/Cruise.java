package workshop13.com.ship;

public class Cruise extends Ship {
    public Cruise() {


    }

    public Cruise(String shipName, int fuelTank) {
        super(shipName, fuelTank);
    }

    @Override
    public void sail(int dist) {
        super.sail(dist * 13);
    }

    @Override
    public String getShipName() {
        return super.getShipName();
    }

    @Override
    public void refuel(int fuelTank) {
        super.refuel(fuelTank * 8);
    }
}
