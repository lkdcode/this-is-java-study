package workshop13.com.ship;

import java.util.ArrayList;

public class ShipTest {
    public static void main(String[] args) {
        ArrayList<Ship> list = new ArrayList<>();
        list.add(new Boat("Boat01", 500));
        list.add(new Cruise("Cruise01", 1000));

        print(list);

        System.out.println("10 운항");
        for (int i = 0; i < list.size(); i++) {
            Ship ship = list.get(i);
            ship.sail(10);
        }
        print(list);

        System.out.println("50 주유");
        for (int i = 0; i < list.size(); i++) {
            Ship ship = list.get(i);
            ship.refuel(50);
        }
        print(list);

    }

    private static void print(ArrayList<Ship> list) {
        System.out.println("shipName\t\t\tfuelTank");
        System.out.println("----------------------------------------");

        for (int i = 0; i < list.size(); i++) {
            Ship ship = list.get(i);
            System.out.println(ship.getShipName() + "\t\t\t\t" + ship.getFuelTank());
        }
        System.out.println();
    }

}
