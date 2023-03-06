package racingcar.controller;

import racingcar.domain.Referee;
import racingcar.domain.Arena;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.Collections;

/**
 * 메인 컨트롤러
 */
public class SystemController {
    private final InputView inputView;
    private final Arena arena;
    private final OutputView outputView;
    private final Referee referee;

    public SystemController() {
        this.inputView = new InputView();
        this.arena = new Arena();
        this.outputView = new OutputView();
        this.referee = new Referee();
    }

    public void playGame() {
        ready();
        start();
    }

    private void ready() {
        String[] carNames = inputView.carNames();
        arena.readyCars(carNames);
    }

    private void start() {
        for (int i = 0; i < inputView.lapTime(); i++) {
            arena.moving();
            referee.addResult(Collections.unmodifiableList(arena.getCars()));
        }

        StringBuilder result = referee.getResult(Collections.unmodifiableList(arena.getCars()));
        outputView.resultPrint(result);
    }

}