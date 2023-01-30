package workshop8.com.car;

public class CarTest {
    public static void main(String[] args) {
        Car[] cars = new Car[2];

        cars[0] = new L3("L3", "1500", 50, 25, 0);
        cars[1] = new L5("L5", "2000", 75, 35, 0);

        System.out.println("vehicleName\t\tengineSize\t\toilTank\t\toilSize\t\tdistance\t\ttemperature");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println(cars[0].toString());
        System.out.println(cars[1].toString());

        System.out.println("\n25 주유");
        cars[0].setOil(25);
        cars[1].setOil(25);

        System.out.println("vehicleName\t\tengineSize\t\toilTank\t\toilSize\t\tdistance\t\ttemperature");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println(cars[0].toString());
        System.out.println(cars[1].toString());

        System.out.println("\n80 주행");
        cars[0].go(80);
        cars[1].go(80);

        System.out.println("vehicleName\t\tengineSize\t\toilTank\t\toilSize\t\tdistance\t\ttemperature");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println(cars[0].toString());
        System.out.println(cars[1].toString());
    }
}
