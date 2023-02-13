package racingcar.input;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 유저로부터 입력받는 역할의 클래스
 */
public class UserInput {
    private final BufferedReader bufferedReader;

    public UserInput() {
        this.bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String inputLapTime() {
        validateLapTime();
        return null;
    }

    public String inputCarName() {
        validateCarName();
        return null;
    }

    private void validateLapTime() {
    }

    private void validateCarName() {
    }
}
