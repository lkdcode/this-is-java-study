package racingcar.controller;

import racingcar.domain.Racing;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.Collections;

/**
 * 메인 컨트롤러
 */
public class SystemController {
    private final InputView inputView;
    private final Racing racing;
    private final OutputView outputView;

    public SystemController() {
        this.inputView = new InputView();
        this.racing = new Racing();
        this.outputView = new OutputView();
    }

    public void start() {
        ready();
        Integer lapTime = inputView.lapTime();

        System.out.printf("%n실행 결과%n");
        for (int i = 0; i < lapTime; i++) {
            this.racing.move();
            outputView.playResultPrint(this.racing.getCars());
            outputView.playResultPrint(Collections.unmodifiableList(this.racing.getCars()));
        }

        outputView.finalWinner(Collections.unmodifiableList(this.racing.getCars()));
    }

    private void ready() {
        String[] carNames = inputView.carNames();
        this.racing.ready(carNames);
    }


}