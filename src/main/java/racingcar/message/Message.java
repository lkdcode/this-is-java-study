package racingcar.message;

/**
 * 유저에게 보여줄 메시지를 가지고 있는 클래스
 * TODO :
 * 출력하는 책임 제거. 단순히 문자열만 리턴
 */
public enum Message {
    INPUT_CAR_NAME("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    INPUT_LAP_TIME("시도할 회수는 몇회인가요?"),
    RESULT("실행 결과"),
    FINAL_WINNER("최종 우승자 : ");
    private String view;

    Message(String view) {
        this.view = view;
    }

    public String message() {
        return view;
    }
}