package hope.exception;

/**
 * 에러 메시지를 관리하는 클래스
 */
public enum ErrorMessage {
    ERROR_MAIN("%n## [ERROR] 원하는 기능을 다시 입력해주세요.%n"),
    ERROR_INPUT_TABLE("## [ERROR] 테이블 번호는 1~6 입니다.%n"),
    ERROR_INPUT_MENU_ORDER("## [ERROR] 해당 매뉴가 없습니다.%n"),
    ERROR_INPUT_NUMBER("## [ERROR] 숫자만 입력해주세요.%n"),

    ERROR_INPUT_MENU_QUANTITY("## [ERROR] 총 주문 수량은 최대 99개 입니다.%n"),
    ERROR_INPUT_PAYMENT("%n## [ERROR] 신용 카드는 1번 현금 결제는 2번을 입력해주세요.%n"),

    ERROR_PAID("%n## [ERROR] 미결제건이 존재합니다.%n%n");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public void print() {
        System.out.printf(this.message);
    }
}
