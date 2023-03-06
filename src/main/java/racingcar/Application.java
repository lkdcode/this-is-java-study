package racingcar;

import racingcar.controller.SystemController;

/**
 * 메인 어플리케이션
 * 게임 실행.
 */
public class Application {
    private static final SystemController systemController = new SystemController();

    public static void main(String[] args) {
        systemController.playGame();
    }
}