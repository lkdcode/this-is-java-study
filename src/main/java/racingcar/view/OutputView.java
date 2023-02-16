package racingcar.view;

import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 유저에게 게임 진행 결과를 출력하는 클래스
 */
public class OutputView {

    public OutputView() {
    }

    public void playResultPrint(List<Car> cars) {

        for (int i = 0; i < cars.size(); i++) {
            Car player = cars.get(i);
            StringBuilder resultPrint = new StringBuilder();
            resultPrint.append(player.getName() + " : ");
            for (int j = 0; j < player.getPosition(); j++) {
                resultPrint.append("-");
            }
            System.out.println(resultPrint);
        }
        System.out.println();
    }

    public void finalWinner(List<Car> cars) {

        int move = Integer.MIN_VALUE;

        for (int i = 0; i < cars.size(); i++) {
            Car player = cars.get(i);
            move = Math.max(player.getPosition(), move);
        }

        List<String> winnerNames = new ArrayList<>();

        for (int i = 0; i < cars.size(); i++) {
            Car player = cars.get(i);
            if (player.getPosition() == move) {
                winnerNames.add(player.getName());
            }
        }

        Collections.sort(winnerNames);

        System.out.print("최종 우승자는 : ");
        for (int i = 0; i < winnerNames.size(); i++) {
            System.out.print(winnerNames.get(i));
            if (i != winnerNames.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}
