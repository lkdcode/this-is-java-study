package racingcar.domain;

/**
 * 경주하게 될 객체
 * TODO :
 * 랩핑 수정
 */
public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    // TODO : 추가 기능 구현
    public void move() {
        position += RandomMove.getInstance().move();
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}