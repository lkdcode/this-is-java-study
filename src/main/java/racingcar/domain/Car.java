package racingcar.domain;

/**
 * 경주하게 될 객체
 */
public class Car {
    private final String name;
    private Integer position;

    public Car(String name) {
        this.name = name;
    }

    // TODO : 추가 기능 구현
    public void move() {
        this.position = new RandomMove().get();
    }

    public String getName() {
        return name;
    }

    public Integer getPosition() {
        return position;
    }
}