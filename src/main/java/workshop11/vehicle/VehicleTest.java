package workshop11.vehicle;

public class VehicleTest {
    /**
     * 초기 트럭의 정보를 출력한다.
     * 50L 주유 후 트럭의 정보를 출력한다.
     * 50Km 주행 후 트럭의 정보를 출력한다.
     * 100Kg을 적재한 후 트럭의 정보를 출력한다.
     * 30Km 주행 후 트럭의 정보를 출력한다.
     * 100Kg을 탑재하고 30Km를 주행하면 요금이 얼마인지 출력한다.
     *
     * @param args
     */
    public static void main(String[] args) {
        Truck car = new Truck(1000, 100, 5);

        System.out.println("최대적재중량\t\t오일탱크크기\t\t잔여오일량\t\t\t현재적재중량\t\t연비");
        System.out.println("=============================================================================");

        System.out.println(car.toString());

        System.out.println("=== 50L 주유 후 ===");
        car.addOil(50);
        System.out.println(car.toString());

        System.out.println("=== 50Km 주행 후 ===");
        car.moving(50);
        System.out.println(car.toString());

        System.out.println("=== 100Kg 적재 후 ===");
        car.addWeight(100);
        System.out.println(car.toString());

        System.out.println("=== 30Km 주행 후 ===");
        car.moving(30);
        System.out.println(car.toString());

        System.out.println(car.getCost(30) + "원");

    }
}