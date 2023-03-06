package racingcar.view;

import racingcar.message.ErrorMessage;
import racingcar.message.Message;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 유저로 부터 자동차 이름들과 시도할 횟수를 입력받는 클래스
 * 내부적으로 유효성 검사를 실행한다.
 */
public class InputView {
    private final BufferedReader bufferedReader;
    private final String SEPARATOR = ",";
    private final int MIN_CAR_LIST = 2;
    private final int MIN_LAP_TIME = 1;

    public InputView() {
        this.bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String[] carNames() {
        while (true) {
            try {
                System.out.println(Message.INPUT_CAR_NAME.message());
                return validateCarNames(bufferedReader.readLine().split(SEPARATOR));
            } catch (IOException e) {
                System.out.println(ErrorMessage.ERROR_INPUT_CAR_NAME.message());
            }
        }
    }

    public int lapTime() {
        while (true) {
            try {
                System.out.println(Message.INPUT_LAP_TIME.message());
                return validateLapTime(Integer.parseInt(bufferedReader.readLine()));
            } catch (IOException | NumberFormatException e) {
                System.out.println(ErrorMessage.ERROR_INPUT_LAT_TIME.message());
            }
        }
    }

    private String[] validateCarNames(String[] carNames) throws IOException {
        if (carNames.length < MIN_CAR_LIST) {
            throw new IOException();
        }
        return carNames;
    }

    private int validateLapTime(int lapTime) throws IOException {
        if (lapTime < MIN_LAP_TIME) {
            throw new IOException();
        }
        return lapTime;
    }

}