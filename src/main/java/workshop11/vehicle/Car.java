package workshop11.vehicle;

public class Car extends Vehicle {
    private double restOil;
    private int curWeight;

    public Car() {
    }

    public Car(int maxWeight, double oilTankSize, double efficiency) {
        super(maxWeight, oilTankSize, efficiency);
    }

    /**
     * 현재 오일량에 추가한다.
     * 단, 오일탱크크기를 넘어서면 안 된다.
     *
     * @param restOil
     */
    public void addOil(int restOil) {
        this.restOil += restOil;

        if (this.restOil > super.getOilTankSize()) {
            this.restOil = super.getOilTankSize();
        }
    }

    /**
     * 연비와 주행거리에 따라 오일량을 감소 시킨다.
     *
     * @param distance
     */
    public void moving(int distance) {
        this.restOil -= distance;
    }

    /**
     * 현재 적재량에 물건을 추가한다.
     * 단, 최대적재중량을 넘어서면 안 된다.
     *
     * @param curWeight
     */
    public void addWeight(int curWeight) {
        this.curWeight += curWeight;

        if (this.curWeight > super.getMaxWeight()) {
            this.curWeight = super.getMaxWeight();
        }
    }


    /**
     * 상위 클래스의 toString()에 잔여오일량과 현재 적재중량을
     * 추가하여 리턴한다.
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + restOil + "\t\t\t\t" + curWeight;
    }

    public int getCurWeight() {
        return curWeight;
    }

}
