package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 자동차를 담고 있는 일급 콜렉션
 */
public class Cars {
    private List<Car> cars;

    public Cars() {
        this.cars = new ArrayList<>();
    }

    public void makeCars(String[] carNames) {
        for (String name : carNames) {
            this.cars.add(new Car(name));
        }
    }

    public void move() {
        for (Car car : this.cars) {
            car.move();
        }
    }

}
