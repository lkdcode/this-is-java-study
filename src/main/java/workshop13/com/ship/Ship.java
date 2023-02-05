package workshop13.com.ship;

public abstract class Ship {
    private String shipName;
    private int fuelTank;

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    public Ship() {

    }

    public Ship(String shipName, int fuelTank) {
        this.shipName = shipName;
        this.fuelTank = fuelTank;
    }

    public void sail(int dist) {
        // 운항
        this.fuelTank -= dist;
    }

    public void refuel(int fuelTank) {
        // 주유
        this.fuelTank += fuelTank;

    }

}
