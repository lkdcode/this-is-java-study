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
    private final Integer MIN_CAR_LIST = 2;
    private final Integer MIN_LAP_TIME = 1;

    public InputView() {
        this.bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String[] carNames() {
        while (true) {
            try {
                Message.INPUT_CAR_NAME.print();
                return validateCarNames(bufferedReader.readLine().split(this.SEPARATOR));
            } catch (IOException e) {
                ErrorMessage.ERROR_INPUT_CAR_NAME.print();
            }
        }
    }

    public Integer lapTime() {
        while (true) {
            try {
                Message.INPUT_LAP_TIME.print();
                return validateLapTime(Integer.parseInt(bufferedReader.readLine()));
            } catch (IOException | NumberFormatException e) {
                ErrorMessage.ERROR_INPUT_LAT_TIME.print();
            }
        }
    }

    private String[] validateCarNames(String[] carNames) throws IOException {
        if (carNames.length < this.MIN_CAR_LIST) {
            throw new IOException();
        }
        return carNames;
    }

    private Integer validateLapTime(Integer lapTime) throws IOException {
        if (lapTime < this.MIN_LAP_TIME) {
            throw new IOException();
        }
        return lapTime;
    }

}