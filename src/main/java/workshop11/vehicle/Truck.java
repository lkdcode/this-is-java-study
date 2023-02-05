package workshop11.vehicle;

public class Truck extends Car {

    public Truck() {
    }

    public Truck(int maxWeight, double oilTankSize, double efficiency) {
        super(maxWeight, oilTankSize, efficiency);
    }

    /**
     * 현재 적재 중량 5Kg 당 연비 0.2Km 감소시킨 값을 리턴한다.
     *
     * @return
     */
    @Override
    public double getEfficiency() {
        return super.getEfficiency() - ((double) (super.getCurWeight() / 5) * 0.2);
    }

    /**
     * calcOil()을 호출하여 오일 감소량을 획득하고, 잔여오일량에서 감소량을 뺀
     * 새로운 잔여오일량으로 재설정한다.
     *
     * @param distance
     */
    @Override
    public void moving(int distance) {
        distance = (int) calcOil(distance);
        super.moving(distance);
    }


    /**
     * 거리를 연비로 나누어 오일 소모량을 추출하고 리턴한다.
     *
     * @param distance
     * @return
     */
    private double calcOil(int distance) {
        return distance / getEfficiency();
    }

    /**
     * calcOil()을 호출하여 오일 감소량을 획득하고, 1L 당 3000원의 요금을 산정하여 리턴한다.
     *
     * @param distance
     * @return
     */
    public int getCost(int distance) {
        return (int) (calcOil(distance) * 3000);
    }


    /**
     * 상위 클래스 toString()에 연비를 추가하여 리턴한다.
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + "\t\t\t" + getEfficiency() + "\n";
    }

}
