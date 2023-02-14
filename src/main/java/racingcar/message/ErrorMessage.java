package racingcar.message;

/**
 * Exception 발생 시 출력할 메시지를 가지고 있는 클래스
 */
public enum ErrorMessage {
    ERROR_INPUT_CAR_NAME("[ERROR] 최소 1명이상 입력하여야 합니다. (쉼표(,) 기준으로 구분)%n%n"),
    ERROR_INPUT_LAT_TIME("[ERROR] 시도 횟수는 숫자여야 하며 최소 1 이상이어야 합니다.%n%n");
    private String view;

    ErrorMessage(String view) {
        this.view = view;
    }

    public void print() {
        System.out.printf(this.view);
    }
}
