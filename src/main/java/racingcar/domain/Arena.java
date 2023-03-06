package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 자동차를 담고 있는 일급 콜렉션
 * TODO :
 * 단순히 전달만 하는 객체와 합쳐서 역할 부여
 */
public class Arena {
    private List<Car> cars;

    public Arena() {
        this.cars = new ArrayList<>();
    }

    public void readyCars(String[] carNames) {
        for (String name : carNames) {
            cars.add(new Car(name));
        }
    }

    public void moving() {
        for (Car car : cars) {
            car.move();
        }
    }

    public List<Car> getCars() {
        return cars;
    }

}