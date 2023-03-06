package racingcar.domain;

import racingcar.message.Message;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 출력 결과를 만드는 역할
 */
public class Referee {
    private final String RUN = "-";
    private final String NAME_SEPARATOR = " : ";
    private final String LINE_SEPARATOR = "line.separator";
    private final String WINNER_SEPARATOR = ", ";
    private final StringBuilder result;

    public Referee() {
        this.result = new StringBuilder();
        initialize();
    }

    private void initialize() {
        result.append(System.getProperty(LINE_SEPARATOR))
                .append(Message.RESULT.message())
                .append(System.getProperty(LINE_SEPARATOR))
                .append(System.getProperty(LINE_SEPARATOR));
    }

    public void addResult(List<Car> cars) {

        for (int i = 0; i < cars.size(); i++) {
            Car player = cars.get(i);

            result.append(player.getName())
                    .append(NAME_SEPARATOR);

            for (int j = 0; j < player.getPosition(); j++) {
                result.append(RUN);
            }

            result.append(System.getProperty(LINE_SEPARATOR));
        }

        result.append(System.getProperty(LINE_SEPARATOR));
    }

    public StringBuilder getResult(List<Car> cars) {
        result.append(Message.FINAL_WINNER.message());
        findWinnerNames(cars, findWinnerMove(cars));

        return result;
    }

    private void findWinnerNames(List<Car> cars, int winnerMove) {
        List<String> winnerNames = new ArrayList<>();

        for (Car car : cars) {
            if (car.getPosition() == winnerMove) {
                winnerNames.add(car.getName());
            }
        }

        Collections.sort(winnerNames);

        for (int i = 0; i < winnerNames.size(); i++) {
            result.append(winnerNames.get(i));
            if (i + 1 < winnerNames.size()) {
                result.append(WINNER_SEPARATOR);
            }
        }
    }

    private int findWinnerMove(List<Car> cars) {
        int winnerMove = Integer.MIN_VALUE;

        for (Car car : cars) {
            winnerMove = Math.max(car.getPosition(), winnerMove);
        }

        return winnerMove;
    }

}