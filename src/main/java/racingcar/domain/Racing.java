package racingcar.domain;

import java.util.List;

public class Racing {
    private Cars cars;

    public Racing() {
        this.cars = new Cars();
    }

    public void ready(String[] carNames) {
        this.cars.makeCars(carNames);
    }

    public void move() {
        this.cars.move();
    }

    public List<Car> getCars() {
        return this.cars.getCars();
    }

}

